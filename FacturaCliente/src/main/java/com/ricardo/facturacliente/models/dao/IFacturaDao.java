package com.ricardo.facturacliente.models.dao;

import com.ricardo.facturacliente.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDao extends CrudRepository<Factura, Long> {
}
