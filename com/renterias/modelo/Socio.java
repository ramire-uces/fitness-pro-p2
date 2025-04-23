package com.renterias.modelo;

import java.util.Date;

public class Socio extends Usuario {
    private String nombre;
    private Direccion direccion;
    private Telefono telefono;
    private String email;
    private Membresia membresia;
    private Carnet carnet; 

    public Socio() {}

    public Socio(String password, Date fechaDeRegistro, String nombre, Direccion direccion, Telefono telefono, String email) {
        super(password, fechaDeRegistro);
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.membresia = new Membresia(this);
        this.carnet = new Carnet(this, this.membresia); 
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    public Telefono getTelefono() { return telefono; }
    public void setTelefono(Telefono telefono) { this.telefono = telefono; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Membresia getMembresia() { return membresia; }
    public void setMembresia(Membresia membresia) { this.membresia = membresia; }

    public Carnet getCarnet() { return carnet; }
}
