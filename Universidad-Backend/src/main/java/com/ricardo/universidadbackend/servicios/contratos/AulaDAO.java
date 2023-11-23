package com.ricardo.universidadbackend.servicios.contratos;

import com.ricardo.universidadbackend.modelo.entidades.Aula;
import com.ricardo.universidadbackend.modelo.entidades.enumeradores.Pizarron;

import java.util.Optional;

public interface AulaDAO extends GenericoDAO<Aula> {
    Iterable<Aula> findAulasByPizarron(Pizarron pizarron);
    Iterable<Aula> findAulasByPabellonNombre(String nombre);
    Optional<Aula> findAulaByNroAula(Integer nroAula);
}
