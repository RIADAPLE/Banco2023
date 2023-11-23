package com.ricardo.universidadbackend.servicios.contratos;

import com.ricardo.universidadbackend.modelo.entidades.Persona;
import com.ricardo.universidadbackend.modelo.entidades.enumeradores.TipoEmpleado;

public interface EmpleadoDAO extends PersonaDAO{

    Iterable<Persona> findEmpleadosByTipo(TipoEmpleado tipo);
}
