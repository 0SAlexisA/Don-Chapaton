package com.example.api.controllers;

import com.example.api.models.Usuario;
import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    private final Faker faker = new Faker();

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            usuarios.add(new Usuario(
                    faker.name().fullName(),
                    "@" + faker.name().username(),
                    faker.phoneNumber().cellPhone()
            ));
        }
        return usuarios;
    }

    @GetMapping("/usuarios/{id}")
    public Usuario getUsuario(@PathVariable int id) {
        return new Usuario(
                faker.name().fullName(),
                "@" + faker.name().username(),
                faker.phoneNumber().cellPhone()
        );
    }
}