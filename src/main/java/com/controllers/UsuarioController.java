package com.example.api.controllers;

import com.example.api.models.Usuario;
import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Controlador REST para gestionar usuarios.
 * Este controlador utiliza la biblioteca Faker para generar datos simulados.
 */

@RestController // Marca esta clase como un controlador REST.
public class UsuarioController {

    private final Faker faker = new Faker(); // Instancia de Faker para generar datos falsos.

    /**
     * Endpoint para obtener una lista de usuarios simulados.
     * return Una lista de objetos Usuario con datos generados aleatoriamente.
     */

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>(); // Lista para almacenar los usuarios generados.
        for (int i = 0; i < 5; i++) { // Genera 5 usuarios simulados.
            usuarios.add(new Usuario(
                    faker.name().fullName(), // Nombre completo generado aleatoriamente.
                    "@" + faker.name().username(), // Nombre de usuario generado aleatoriamente.
                    faker.phoneNumber().cellPhone() // Número de teléfono generado aleatoriamente.
            ));
        }
        return usuarios; // Retorna la lista de usuarios.
    }

    /**
     * Endpoint para obtener un usuario específico por su ID.
     * Nota: Aunque se acepta un ID, este método siempre genera y retorna un usuario nuevo,
     * ya que no existe un almacenamiento real de usuarios.
     * param id El ID del usuario (actualmente no se utiliza para buscar usuarios específicos).
     * return Un objeto Usuario con datos generados aleatoriamente.
     */

    @GetMapping("/usuarios/{id}")
    public Usuario getUsuario(@PathVariable int id) {
        // Genera un usuario simulado con datos aleatorios.
        return new Usuario(
                faker.name().fullName(), // Nombre completo generado aleatoriamente.
                "@" + faker.name().username(), // Nombre de usuario generado aleatoriamente.
                faker.phoneNumber().cellPhone() // Número de teléfono generado aleatoriamente.
        );
    }
}