package com.example.api.models;

public class Usuario {
    private String nombre;
    private String instagram;
    private String telefono;

    // Constructor
    public Usuario(String nombre, String instagram, String telefono) {
        this.nombre = nombre;
        this.instagram = instagram;
        this.telefono = telefono;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getInstagram() { return instagram; }
    public void setInstagram(String instagram) { this.instagram = instagram; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}