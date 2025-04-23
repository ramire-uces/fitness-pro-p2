package com.renterias.modelo;

import java.util.Date;

public class Reserva {
    private Socio socio;
    private Clase clase;
    private Date fecha;

    public Reserva() {}

    public Reserva(Socio socio, Clase clase, Date fecha) {
        this.socio = socio;
        this.fecha = fecha;

        if (clase.getCapacidadDeLaClase() > clase.getSociosAnotados().size()) {
            this.clase = clase;
            clase.agregarSocio(socio);
        } else {
            System.out.println("La clase está llena.");
        }
    }

    public Socio getSocio() { return socio; }
    public void setSocio(Socio socio) { this.socio = socio; }

    public Clase getClase() { return clase; }
    public void setClase(Clase clase) { this.clase = clase; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
} 


