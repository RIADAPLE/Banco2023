package com.formspringboot.services;

import com.formspringboot.models.domain.Role;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RoleService {

    public List<Role> listar();
    public Role obtenerPorId(Integer id);
}
