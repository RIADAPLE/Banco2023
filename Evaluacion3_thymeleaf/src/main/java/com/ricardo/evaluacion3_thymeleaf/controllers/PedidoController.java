package com.ricardo.evaluacion3_thymeleaf.controllers;

import com.ricardo.evaluacion3_thymeleaf.models.entity.Cliente;
import com.ricardo.evaluacion3_thymeleaf.models.entity.ItemPedido;
import com.ricardo.evaluacion3_thymeleaf.models.entity.Pedido;
import com.ricardo.evaluacion3_thymeleaf.models.entity.Producto;
import com.ricardo.evaluacion3_thymeleaf.models.service.IClienteService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/pedido")
@SessionAttributes("pedido")
public class PedidoController {

    @Autowired
    private IClienteService clienteService;

    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/ver/{id}")
    public String ver(@PathVariable(value="id") Long id,
                      Model model,
                      RedirectAttributes flash) {
        Pedido pedido = clienteService.findPedidoById(id);

        if(pedido == null) {
            flash.addFlashAttribute("error", "La pedido no existe en la base de datos!");
            return "redirect:/listar";
        }

        model.addAttribute("pedido", pedido);
        model.addAttribute("titulo", "Pedido: ".concat(pedido.getDescripcion()));

        return "pedido/ver";
    }

    @GetMapping("/form/{clienteId}")
    public String crear(@PathVariable(value = "clienteId") Long clienteId, Map<String, Object> model,
                        RedirectAttributes flash) {

        Cliente cliente = clienteService.findOne(clienteId);

        if (cliente == null) {
            flash.addFlashAttribute("error", "El cliente no existe en la base de datos");
            return "redirect:/listar";
        }

        Pedido pedido = new Pedido();
        pedido.setClientes(cliente);

        model.put("pedido", pedido);
        model.put("titulo", "Crear Pedido");

        return "pedido/form";
    }

    @GetMapping(value = "/cargar-productos/{term}", produces = { "application/json" })
    public @ResponseBody List<Producto> cargarProductos(@PathVariable String term) {
        return clienteService.findByNombre(term);
    }

    @PostMapping("/form")
    public String guardar(@Valid Pedido pedido,
                          BindingResult result, Model model,
                          @RequestParam(name = "item_id[]", required = false) Long[] itemId,
                          @RequestParam(name = "cantidad[]", required = false) Integer[] cantidad,
                          RedirectAttributes flash,
                          SessionStatus status) {

        if (result.hasErrors()) {
            model.addAttribute("titulo", "Crear Pedido");
            return "pedido/form";
        }

        if (itemId == null || itemId.length == 0) {
            model.addAttribute("titulo", "Crear Pedido");
            model.addAttribute("error", "Error: La pedido NO puede no tener líneas!");
            return "pedido/form";
        }

        for (int i = 0; i < itemId.length; i++) {
            Producto producto = clienteService.findProductoById(itemId[i]);

            ItemPedido linea = new ItemPedido();
            linea.setCantidad(cantidad[i]);
            linea.setProducto(producto);
            pedido.addItemPedido(linea);

            log.info("ID: " + itemId[i].toString() + ", cantidad: " + cantidad[i].toString());
        }

        clienteService.savePedido(pedido);
        status.setComplete();

        flash.addFlashAttribute("success", "Pedido creada con éxito!");

        return "redirect:/ver/" + pedido.getClientes().getId();
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value="id") Long id, RedirectAttributes flash) {

        Pedido pedido = clienteService.findPedidoById(id);

        if(pedido != null) {
            clienteService.deletePedido(id);
            flash.addFlashAttribute("success", "Pedido eliminada con éxito!");
            return "redirect:/ver/" + pedido.getClientes().getId();
        }
        flash.addFlashAttribute("error", "La pedido no existe en la base de datos, no se pudo eliminar!");

        return "redirect:/listar";
    }

}
