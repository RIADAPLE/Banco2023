package com.ricardo.universidadbackend.servicios.contratos;

import com.ricardo.universidadbackend.modelo.entidades.Pabellon;

import java.time.LocalDateTime;
import java.util.Optional;

public interface PabellonDAO extends GenericoDAO<Pabellon>{

    Iterable<Pabellon> buscarPabellonesPorLocalidad(String localidad);
    Optional<Pabellon> findPabellonByNombreIgnoreCase(String nombre);
    Iterable<Pabellon> findPabellonsByFechaAltaBetween(LocalDateTime desde,
                                                       LocalDateTime hasta);
}
