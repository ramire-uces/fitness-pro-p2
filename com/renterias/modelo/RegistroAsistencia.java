package com.renterias.modelo;

import java.util.Date;

public class RegistroAsistencia {
    private Socio socio;
    private Date fecha;
    private Clase clase;

    public RegistroAsistencia() {}

    public RegistroAsistencia(Socio socio, Date fecha, Clase clase) {
        this.socio = socio;
        this.fecha = fecha;
        this.clase = clase;
    }

    public Socio getSocio() { return socio; }
    public void setSocio(Socio socio) { this.socio = socio; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public Clase getClase() { return clase; }
    public void setClase(Clase clase) { this.clase = clase; }
}

