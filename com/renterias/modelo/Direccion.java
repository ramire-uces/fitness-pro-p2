package com.renterias.modelo;

public class Direccion {
    private String calle;
    private String ciudad;
    private int codigoPostal;
    private String estado;

    public Direccion() {}

    public Direccion(String calle, String ciudad, int codigoPostal, String estado) {
        this.calle = calle;
        this.ciudad = ciudad;
        if (codigoPostal <= 0) {
            throw new IllegalArgumentException("El código postal debe ser un número.");
        }
        this.codigoPostal = codigoPostal;
        this.estado = estado;
    }

    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public int getCodigoPostal() { return codigoPostal; }
    public void setCodigoPostal(int codigoPostal) { this.codigoPostal = codigoPostal; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
