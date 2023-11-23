package com.ricardo.universidadbackend.repositorios;

import com.ricardo.universidadbackend.modelo.entidades.Aula;
import com.ricardo.universidadbackend.modelo.entidades.enumeradores.Pizarron;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AulaRepository  extends CrudRepository<Aula, Integer> {

    //@Query("select a from Aula a where a.pizarron = ?1 ")
    Iterable<Aula> findAulasByPizarron(Pizarron pizarron);

    //@Query("select a from Aula a, Pabellon p where p.nombre = ?1 ")
    Iterable<Aula> findAulasByPabellon_Nombre(String nombre);

    //@Query("select a from Aula a where a.nroAula = ?1 ")
    Optional<Aula> findAulaByNroAula(Integer nroAula);
}