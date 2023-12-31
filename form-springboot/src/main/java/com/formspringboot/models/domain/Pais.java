package com.formspringboot.models.domain;

import jakarta.validation.constraints.NotEmpty;

public class Pais {
    private int id;
    @NotEmpty
    private String codigo;
    private String nombre;

    public Pais() {
    }

    public Pais(int id, String codigo, String nombre) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
