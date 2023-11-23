package com.ricardo.universidadbackend.comandos;

import com.ricardo.universidadbackend.modelo.entidades.*;
import com.ricardo.universidadbackend.servicios.contratos.AulaDAO;
import com.ricardo.universidadbackend.servicios.contratos.CarreraDAO;
import com.ricardo.universidadbackend.servicios.contratos.PabellonDAO;
import com.ricardo.universidadbackend.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Component
@Order(1)
public class InitCommand implements CommandLineRunner {

    @Autowired
    @Qualifier(value = "alumnoDAOImpl")
    private PersonaDAO servicioAlumno;

    @Autowired
    @Qualifier(value = "empleadoDAOImpl")
    private PersonaDAO servicioEmpleado;

    @Autowired
    @Qualifier(value = "profesorDAOImpl")
    private PersonaDAO servicioProfesor;

    @Autowired
    private AulaDAO servicioAula;

    @Autowired
    private PabellonDAO servicioPabellon;
    @Autowired
    private CarreraDAO servicioCarrera;


    @Override
    public void run(String... args) throws Exception {
       /* System.out.println(" ********** ---------- Init Command ---------- ***********");
        servicioAula.save(ObjetosDummy.getAula123());
        servicioAula.save(ObjetosDummy.getAula231());
        servicioAula.save(ObjetosDummy.getAula451());

        servicioPabellon.save(ObjetosDummy.getPabellonUno());
        servicioPabellon.save(ObjetosDummy.getPabellonDos());

        Carrera ing = servicioCarrera.save(ObjetosDummy.getCarreraIngSis());
        Carrera lic = servicioCarrera.save(ObjetosDummy.getCarreraLicTur());

        servicioAlumno.save(ObjetosDummy.getAlumnoUno());
        servicioAlumno.save(ObjetosDummy.getAlumnoDos());

        servicioAlumno.save(ObjetosDummy.getProfesorUno());
        servicioAlumno.save(ObjetosDummy.getProfesorDos());

        servicioAlumno.save(ObjetosDummy.getEmpleadoUno());
        servicioAlumno.save(ObjetosDummy.getEmpleadoDos());

        Aula a1 = servicioAula.findAulaByNroAula(ObjetosDummy.getAula123()
                .getNroAula()).get();
        Aula a2 = servicioAula.findAulaByNroAula(ObjetosDummy.getAula231()
                .getNroAula()).get();
        Aula a3 = servicioAula.findAulaByNroAula(ObjetosDummy.getAula451()
                .getNroAula()).get();

        Pabellon p1 = servicioPabellon.findPabellonByNombreIgnoreCase(ObjetosDummy.getPabellonUno().getNombre()).get();
        Pabellon p2 = servicioPabellon.findPabellonByNombreIgnoreCase(ObjetosDummy.getPabellonDos().getNombre()).get();

        a1.setPabellon(p1);
        a2.setPabellon(p1);
        a3.setPabellon(p2);

        servicioAula.save(a1);
        servicioAula.save(a2);
        servicioAula.save(a3);

        Carrera ingSis = servicioCarrera.findById(ing.getId()).get();
        Carrera lisTur = servicioCarrera.findById(lic.getId()).get();

        Persona alumno1 = (Alumno) servicioAlumno.buscarPorDni(ObjetosDummy.getAlumnoUno().getDni()).get();
        Persona alumno2 = (Alumno) servicioAlumno.buscarPorDni(ObjetosDummy.getAlumnoDos().getDni()).get();

        ((Alumno)alumno1).setCarrera(ingSis);
        ((Alumno)alumno2).setCarrera(lisTur);


        servicioAlumno.save(alumno1);
        servicioAlumno.save(alumno2);

        Persona profe1 = servicioProfesor.buscarPorDni(ObjetosDummy.getProfesorUno().getDni()).get();
        Persona profe2 = servicioProfesor.buscarPorDni(ObjetosDummy.getProfesorDos().getDni()).get();

        Set<Carrera> sets = new HashSet<>();

        sets.add(ingSis);

        ((Profesor)profe1).setCarrera(sets);

        sets.add(lisTur);
        ((Profesor)profe2).setCarrera(sets);

        servicioProfesor.save(profe1);
        servicioProfesor.save(profe2);

        Persona emple1 = servicioEmpleado.buscarPorDni(ObjetosDummy.getEmpleadoUno().getDni()).get();
        Persona emple2 = servicioEmpleado.buscarPorDni(ObjetosDummy.getEmpleadoDos().getDni()).get();

        ((Empleado)emple1).setPabellon(p1);
        ((Empleado)emple1).setPabellon(p2);

        servicioEmpleado.save(emple1);
        servicioEmpleado.save(emple2);

        Persona al1 = new Alumno(null, "Nombre", "Apellido Uno", "56219842", new Direccion());
        Persona al2 = new Alumno(null,"Nombre", "Apellido Uno", "56219842", new Direccion());
        Persona al3 = new Alumno(null,"Nombre", "Apellido Uno", "56219842", new Direccion());
        Persona al4 = new Alumno(null,"Nombre", "Apellido Uno", "56219842", new Direccion());

        servicioAlumno.save(al1);
        servicioAlumno.save(al2);
        servicioAlumno.save(al3);
        servicioAlumno.save(al4);

        Optional<Carrera> ing1 = servicioCarrera.findById(2);
        Iterable<Persona> all = servicioAlumno.findAll();

        all.forEach(alumno -> {
            if(alumno instanceof Alumno) {
                if(alumno.getId() > 2) {
                    ((Alumno) alumno).setCarrera(ing1.get());
                }
            }
        });

        all.forEach(alumno -> {
            if (alumno instanceof Alumno) {
                servicioAlumno.save(alumno);
            }
        });*/


    }
}

