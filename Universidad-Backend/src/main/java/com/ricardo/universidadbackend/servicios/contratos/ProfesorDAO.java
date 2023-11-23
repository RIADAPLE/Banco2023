package com.ricardo.universidadbackend.servicios.contratos;

import com.ricardo.universidadbackend.modelo.entidades.Persona;

public interface ProfesorDAO extends PersonaDAO{

    Iterable<Persona> findProfesoresByCarrera(String nombre);
}
