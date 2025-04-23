package com.renterias.modelo;

import java.util.Date;
import java.util.UUID;

public class Carnet {
    private String idCarnet;
    private Socio socio;
    private Membresia membresia;

    public Carnet() {}

    public Carnet(Socio socio, Membresia membresia) {
        this.idCarnet = UUID.randomUUID().toString();
        this.socio = socio;
        this.membresia = membresia;
    }

    public String getIdCarnet() { return idCarnet; }

    public Socio getSocio() { return socio; }
    public void setSocio(Socio socio) { this.socio = socio; }

    public Date getFechaDeVencimiento() { return membresia.getFechaDeVencimiento(); }

    public boolean membresiaValida() { return membresia.esValida(); }
}

