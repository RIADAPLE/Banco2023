package com.ricardo.universidadbackend.servicios.implementaciones;

import com.ricardo.universidadbackend.modelo.entidades.Persona;
import com.ricardo.universidadbackend.repositorios.PersonaRepository;
import com.ricardo.universidadbackend.repositorios.ProfesorRepository;
import com.ricardo.universidadbackend.servicios.contratos.ProfesorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProfesorDAOImpl extends PersonaDAOImpl implements ProfesorDAO {
    @Autowired
    public ProfesorDAOImpl(@Qualifier("profesorRepository")
                           PersonaRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Persona> findProfesoresByCarrera(String nombre) {
        return ((ProfesorRepository)repository).findProfesoresByCarrera(nombre);
    }
}
