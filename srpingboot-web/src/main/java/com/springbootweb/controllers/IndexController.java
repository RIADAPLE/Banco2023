package com.springbootweb.controllers;

import com.springbootweb.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({"/index", "/", "", "/home"})
    public String index(Model model){
        model.addAttribute("titulo", "Hola spring Framework con model");
        return "index";
    }

    @RequestMapping("/perfil")
    public String perfil(Model model){
        Usuario usuario = new Usuario("Ricardo", "Aparicio", "ricardo.190221@gmail.com");
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil de usuario");
        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar(Model model) {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario1 = new Usuario("Ricardo", "Aparicio", "ricardo.190221@gmail.com");
        Usuario usuario2 = new Usuario("Adrián", "Lemus", "Adrian.190221@gmail.com");
        Usuario usuario3 = new Usuario("Luis", "Castillo", "LuisGCH@gmail.com");
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        model.addAttribute("titulo", "Listado de Usuarios");
        model.addAttribute("usuarios", usuarios);

        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario1 = new Usuario("Ricardo", "Aparicio", "ricardo.190221@gmail.com");
        Usuario usuario2 = new Usuario("Adrián", "Lemus", "Adrian.190221@gmail.com");
        Usuario usuario3 = new Usuario("Luis", "Castillo", "LuisGCH@gmail.com");
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }
}
