package com.ricardo.universidadbackend.repositorios;

import com.ricardo.universidadbackend.modelo.entidades.Persona;
import org.springframework.data.jpa.repository.Query;

public interface ProfesorRepository extends PersonaRepository{

    @Query("select p from Profesor p join fetch p.carreras c where c.nombre = ?1")
    Iterable<Persona> findProfesoresByCarrera(String carrera);
}
