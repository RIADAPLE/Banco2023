package com.example.evaluacion2.entities;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Component
@RequestScope
public class Factura implements Serializable {

    private static final long serialVersionUID = 946004357128146951L;

    @Value("${factura.descripcion}")
    private String descripcion;

    @Autowired
    private Cliente cliente;

    @Autowired
    private List<ItemFactura> items;

    @Autowired
    private List<ItemFactura> itemsCorporal;

    public List<ItemFactura> getItemsCorporal() {
        List<ItemFactura> corporal = new ArrayList<>();

        for (ItemFactura item:itemsCorporal) {
            if(item.getProducto().getCategoria().equals(Categoria.CUIDADO_CORPORAL)){
                corporal.add(item);
            }
        }
        return corporal;
    }

    public float getTotalCorporal(){
        float sumador = 0;

        for (ItemFactura item:itemsCorporal) {
            if(item.getProducto().getCategoria().equals(Categoria.CUIDADO_CORPORAL)){
                sumador = sumador + item.calcularImporte();
            }
        }
        return sumador;
    }

    public List<ItemFactura> getItemsBucal() {
        List<ItemFactura> bucal = new ArrayList<>();

        for (ItemFactura item:itemsBucal) {
            if(item.getProducto().getCategoria().equals(Categoria.CUIDADO_BUCAL)){
                bucal.add(item);
            }
        }
        return bucal;
    }

    public float getTotalBucal(){
        float sumador = 0;

        for (ItemFactura item:itemsBucal) {
            if(item.getProducto().getCategoria().equals(Categoria.CUIDADO_BUCAL)){
                sumador += item.calcularImporte();
            }
        }
        return sumador;
    }

    public float getTotal(){
        float sumador = 0;

        for (ItemFactura item:items) {
            sumador += item.calcularImporte();
        }
        return sumador;
    }

    @Autowired
    private List<ItemFactura> itemsBucal;

    @PostConstruct
    public void inicializar() {
        cliente.setNombre(cliente.getNombre().concat(" ").concat("José"));
        descripcion = descripcion.concat(" del cliente: ").concat(cliente.getNombre());
    }

    @PreDestroy
    public void destruir() {
        System.out.println("Factura destruida: ".concat(descripcion));
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemFactura> getItems() {
        return items;
    }

    public void setItems(List<ItemFactura> items) {
        this.items = items;
    }
}
