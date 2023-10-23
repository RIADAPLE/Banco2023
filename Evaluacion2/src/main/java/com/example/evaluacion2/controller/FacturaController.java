package com.example.evaluacion2.controller;

import com.example.evaluacion2.entities.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FacturaController {

    @Autowired
    private Factura factura;

    @GetMapping("/factura")
    public String ver(Model model) {
        model.addAttribute("factura", factura);
        model.addAttribute("titulo", "Ejemplo Factura de farmacia");
        return "factura/ver";
    }
}
