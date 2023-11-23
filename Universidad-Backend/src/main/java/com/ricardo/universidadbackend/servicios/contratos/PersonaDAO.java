package com.ricardo.universidadbackend.servicios.contratos;

import com.ricardo.universidadbackend.modelo.entidades.Persona;

import java.util.Optional;

public interface PersonaDAO extends GenericoDAO<Persona>{

    Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido);
    Optional<Persona> buscarPorDni(String dni);
    Iterable<Persona> buscarPersonasPorApellido(String apellido);
}
