package com.example.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de la aplicación Spring Boot.
 * Esta clase actúa como el punto de entrada para iniciar la aplicacion.
 */

@SpringBootApplication // Anotacion que habilita la configuracion automatica de Spring Boot y el escaneo de componentes.
public class ApiApplication {

     /**
     * Metodo principal (`main`) que inicia la aplicacion.
     * param args Argumentos de línea de comandos (opcional).
     */

    public static void main(String[] args) {
        // Metodo para ejecutar la aplicacion Spring Boot.
        SpringApplication.run(ApiApplication.class, args);
    }
}