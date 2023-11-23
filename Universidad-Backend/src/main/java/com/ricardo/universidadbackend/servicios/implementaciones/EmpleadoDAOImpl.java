package com.ricardo.universidadbackend.servicios.implementaciones;

import com.ricardo.universidadbackend.modelo.entidades.Persona;
import com.ricardo.universidadbackend.modelo.entidades.enumeradores.TipoEmpleado;
import com.ricardo.universidadbackend.repositorios.EmpleadoRepository;
import com.ricardo.universidadbackend.repositorios.PersonaRepository;
import com.ricardo.universidadbackend.servicios.contratos.EmpleadoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpleadoDAOImpl extends PersonaDAOImpl implements EmpleadoDAO {
    @Autowired
    public EmpleadoDAOImpl(@Qualifier("empleadoRepository")PersonaRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Persona> findEmpleadosByTipo(TipoEmpleado tipo) {
        return ((EmpleadoRepository)repository).findEmpleadoByTipoEmpleado(tipo);
    }
}
