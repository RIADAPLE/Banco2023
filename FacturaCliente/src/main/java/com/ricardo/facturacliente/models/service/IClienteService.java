package com.ricardo.facturacliente.models.service;

import com.ricardo.facturacliente.models.entity.Cliente;
import com.ricardo.facturacliente.models.entity.Factura;
import com.ricardo.facturacliente.models.entity.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pageable);

    public void save(Cliente cliente);

    public Cliente findOne(Long id);

    public void delete(Long id);

    public Producto findProductoById(Long id);

    public Factura findFacturaById(Long id);

    public void saveFactura(Factura factura);

    public void deleteFactura(Long id);

    public List<Producto> findByNombre (String term);
}
