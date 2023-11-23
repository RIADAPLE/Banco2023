package com.ricardo.universidadbackend;

import com.ricardo.universidadbackend.modelo.entidades.Alumno;
import com.ricardo.universidadbackend.modelo.entidades.Direccion;
import com.ricardo.universidadbackend.modelo.entidades.Persona;
import com.ricardo.universidadbackend.servicios.contratos.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UniversidadBackendApplication {

	@Autowired
	private AlumnoDAO servicio;

	public static void main(String[] args) {
		String[] beanDefinitionNames =
				SpringApplication.run(UniversidadBackendApplication.class, args).getBeanDefinitionNames();
	}

	public CommandLineRunner runner() {
		return args -> {
			Direccion direccion = new Direccion("calle lomina", "123","9400","","","Abril");
			Persona alumno = new Alumno(null, "Juan", "Palacios", "684736834", direccion);
			Persona save = servicio.save(alumno);
			System.out.println(save.toString());

			List<Persona> alumnos = (List<Persona>) servicio.findAll();
			alumnos.forEach(System.out::println);
		};
	}
}
