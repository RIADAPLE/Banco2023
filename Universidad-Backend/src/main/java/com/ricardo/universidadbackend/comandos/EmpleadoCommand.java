package com.ricardo.universidadbackend.comandos;

import com.ricardo.universidadbackend.modelo.entidades.Persona;
import com.ricardo.universidadbackend.modelo.entidades.enumeradores.TipoEmpleado;
import com.ricardo.universidadbackend.servicios.contratos.EmpleadoDAO;
import com.ricardo.universidadbackend.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class EmpleadoCommand implements CommandLineRunner {

    @Autowired
    @Qualifier(value = "empleadoDAOImpl")
    private PersonaDAO servicioEmpleado;

    @Override
    public void run(String... args) throws Exception {
        /*System.out.println("-------- ********** Empleado Command ********** ----------");

        Iterable<Persona> iEmpleado =
                ((EmpleadoDAO) servicioEmpleado).findEmpleadosByTipo(TipoEmpleado.ADMINISTRATIVO);

        iEmpleado.forEach(System.out::println);*/
    }
}
