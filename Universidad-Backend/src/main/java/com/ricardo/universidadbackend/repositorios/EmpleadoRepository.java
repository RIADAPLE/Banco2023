package com.ricardo.universidadbackend.repositorios;

import com.ricardo.universidadbackend.modelo.entidades.Persona;
import com.ricardo.universidadbackend.modelo.entidades.enumeradores.TipoEmpleado;
import org.springframework.data.jpa.repository.Query;

public interface EmpleadoRepository extends PersonaRepository{

    @Query("select e from Empleado e where e.tipoEmpleado = ?1")
    Iterable<Persona> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado);
}
