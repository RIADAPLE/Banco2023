package com.ricardo.evaluacion3_thymeleaf.models.service;


import com.ricardo.evaluacion3_thymeleaf.models.dao.IClienteDao;
import com.ricardo.evaluacion3_thymeleaf.models.dao.IPedidoDao;
import com.ricardo.evaluacion3_thymeleaf.models.dao.IProductoDao;
import com.ricardo.evaluacion3_thymeleaf.models.entity.Cliente;
import com.ricardo.evaluacion3_thymeleaf.models.entity.Pedido;
import com.ricardo.evaluacion3_thymeleaf.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {
    @Autowired
    private IProductoDao productoDao;

    @Autowired
    private IClienteDao clienteDao;

    @Autowired
    private IPedidoDao pedidoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Cliente> findAll(Pageable pageable) {
        return clienteDao.findAll(pageable);
    }


    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findOne(Long id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        clienteDao.deleteById(id);
    }

    @Override
    @Transactional
    public Producto findProductoById(Long id) {
        return productoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public Pedido findPedidoById(Long id) {
        return pedidoDao.findById(id).orElse(null);
    }

    @Override
    public void savePedido(Pedido pedido) {
        pedidoDao.save(pedido);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findByNombre (String term) {
        return productoDao.findByNombreLikeIgnoreCase("%" + term + "%");
    }

    @Override
    @Transactional
    public void deletePedido(Long id) {
        pedidoDao.deleteById(id);
    }
}
