package com.example.api.models;

public class Pedido {
    private String chapata;
    private String papas;
    private String bebida;

    // Constructor
    public Pedido(String chapata, String papas, String bebida) {
        this.chapata = chapata;
        this.papas = papas;
        this.bebida = bebida;
    }

    // Getters y Setters
    public String getChapata() { return chapata; }
    public void setChapata(String chapata) { this.chapata = chapata; }

    public String getPapas() { return papas; }
    public void setPapas(String papas) { this.papas = papas; }

    public String getBebida() { return bebida; }
    public void setBebida(String bebida) { this.bebida = bebida; }
}