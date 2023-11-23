package com.ricardo.universidadbackend.servicios.contratos;

import com.ricardo.universidadbackend.modelo.entidades.Carrera;
import org.springframework.stereotype.Service;

public interface CarreraDAO extends GenericoDAO<Carrera> {

    Iterable<Carrera> findCarrerasByNombreContains(String nombre);
    Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombre);
    Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidadAnios);
}
