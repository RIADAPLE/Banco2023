package com.ricardo.universidadbackend.servicios.contratos;

import com.ricardo.universidadbackend.modelo.entidades.Persona;
import org.springframework.stereotype.Service;

public interface AlumnoDAO extends PersonaDAO{
    Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombre);
}
