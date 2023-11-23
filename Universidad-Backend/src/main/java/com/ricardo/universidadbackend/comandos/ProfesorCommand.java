package com.ricardo.universidadbackend.comandos;

import com.ricardo.universidadbackend.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

@Component
@Order(6)
public class ProfesorCommand implements CommandLineRunner {

    @Autowired
    @Qualifier(value = "profesorDAOImpl")
    private PersonaDAO servicioProfesor;

    @Override
    public void run(String... args) throws Exception {
       // System.out.println("---------- ********** Profesores Command **********");
    }
}
