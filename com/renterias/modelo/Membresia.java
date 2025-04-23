package com.renterias.modelo;

import java.util.Calendar;
import java.util.Date;

public class Membresia {
    private Socio socio;
    private Date fechaDeEmision;
    private Date fechaDeVencimiento;

    public Membresia() {}

    public Membresia(Socio socio) {
        this.socio = socio;
        this.fechaDeEmision = new Date();
        this.fechaDeVencimiento = vencimiento(fechaDeEmision);
    }

    public Date vencimiento(Date fecha) {
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fecha);
        calendario.add(Calendar.MONTH, 1);
        return calendario.getTime();
    }

    public Date getFechaDeVencimiento() { return fechaDeVencimiento; }

    public void renovarMembresia() { this.fechaDeVencimiento = vencimiento(new Date()); }

    public String getSocioId() { return socio.getUserId(); }
    public void setSocio(Socio socio) { this.socio = socio; }

    public boolean esValida() {
        return fechaDeEmision.before(fechaDeVencimiento);
    }
}

