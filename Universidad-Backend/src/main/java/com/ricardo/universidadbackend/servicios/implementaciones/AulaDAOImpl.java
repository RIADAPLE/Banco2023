package com.ricardo.universidadbackend.servicios.implementaciones;

import com.ricardo.universidadbackend.modelo.entidades.Aula;
import com.ricardo.universidadbackend.modelo.entidades.enumeradores.Pizarron;
import com.ricardo.universidadbackend.repositorios.AulaRepository;
import com.ricardo.universidadbackend.servicios.contratos.AulaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AulaDAOImpl extends GenericoDAOImpl<Aula, AulaRepository> implements AulaDAO {

    @Autowired
    public AulaDAOImpl(AulaRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Aula> findAulasByPizarron(Pizarron pizarron) {
        return repository.findAulasByPizarron(pizarron);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Aula> findAulasByPabellonNombre(String nombre) {
        return repository.findAulasByPabellon_Nombre(nombre);
    }

    @Override
    public Optional<Aula> findAulaByNroAula(Integer nroAula) {
        return repository.findAulaByNroAula(nroAula);
    }
}
