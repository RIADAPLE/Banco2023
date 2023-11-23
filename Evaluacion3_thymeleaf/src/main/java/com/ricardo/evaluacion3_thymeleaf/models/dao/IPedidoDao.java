package com.ricardo.evaluacion3_thymeleaf.models.dao;

import com.ricardo.evaluacion3_thymeleaf.models.entity.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface IPedidoDao extends CrudRepository<Pedido, Long> {
}
