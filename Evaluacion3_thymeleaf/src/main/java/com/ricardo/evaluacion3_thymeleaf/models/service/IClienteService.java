package com.ricardo.evaluacion3_thymeleaf.models.service;

import com.ricardo.evaluacion3_thymeleaf.models.entity.Cliente;
import com.ricardo.evaluacion3_thymeleaf.models.entity.Pedido;
import com.ricardo.evaluacion3_thymeleaf.models.entity.Producto;
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

    public Pedido findPedidoById(Long id);

    public void savePedido(Pedido pedido);

    public void deletePedido(Long id);

    public List<Producto> findByNombre (String term);
}
