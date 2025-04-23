package com.renterias.modelo;

public class Telefono {
    private String numero;
    private String tipo;

    public Telefono() {}

    public Telefono(String numero, String tipo) {
        if (!numero.matches("\\d+")) {
            throw new IllegalArgumentException("El número de teléfono solo debe contener números.");
        }
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}