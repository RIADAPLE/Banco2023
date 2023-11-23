package com.ricardo.universidadbackend.repositorios;

import com.ricardo.universidadbackend.datos.DatosDummy;
import com.ricardo.universidadbackend.modelo.entidades.Carrera;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CarreraRepositoryTest {

    @Autowired
    CarreraRepository carreraRepository;

    @BeforeEach
    void setUp(){
        carreraRepository.save(DatosDummy.carrera01(false));
        carreraRepository.save(DatosDummy.carrera02());
        carreraRepository.save(DatosDummy.carrera03(false));
    }

    @AfterEach
    void tearDown(){
        carreraRepository.deleteAll();
    }

    @Test
    @DisplayName("Buscar Carreras por nombre")
    void findCarrerasByNombreContains() {
        //given
        /*carreraRepository.save(DatosDummy.carrera01());
        carreraRepository.save(DatosDummy.carrera02());
        carreraRepository.save(DatosDummy.carrera03());*/

        //when
        Iterable<Carrera> expected = carreraRepository.findCarrerasByNombreContains("Sistemas");

        //then
        assertThat(((List<Carrera>)expected).size() == 2).isTrue();
    }

    @Test
    @DisplayName("Buscar Carreras por nombre NO case sensitive")
    void findCarrerasByNombreContainsIgnoreCase() {
        //given
        /*carreraRepository.save(DatosDummy.carrera01());
        carreraRepository.save(DatosDummy.carrera02());
        carreraRepository.save(DatosDummy.carrera03());*/

        //when
        List<Carrera> expected = (List<Carrera>) carreraRepository.findCarrerasByNombreContainsIgnoreCase("sistemas");

        //then
        assertThat(expected.size() == 2).isTrue();
    }

    @Test
    void findCarrerasByCantidadAniosAfter() {
        //given
        /*carreraRepository.save(DatosDummy.carrera01());
        carreraRepository.save(DatosDummy.carrera02());
        carreraRepository.save(DatosDummy.carrera03());*/

        //when
        List<Carrera> expected = (List<Carrera>) carreraRepository.findCarrerasByCantidadAniosAfter(4);

        //then
        assertThat(expected.size() == 2).isTrue();
    }
}