package com.ricardo.evaluacion3_thymeleaf.models.dao;


import com.ricardo.evaluacion3_thymeleaf.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>, CrudRepository<Cliente, Long> {

}
