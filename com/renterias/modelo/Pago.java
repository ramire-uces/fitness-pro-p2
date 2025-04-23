package com.renterias.modelo;

import java.util.Date;

public class Pago {
    private double monto;
    private String metodoDePago;
    private Socio socio;
    private Date fechaDePago;
    private Date fechaDeVencimiento;

    public Pago() {}

    public Pago(double monto, String metodoDePago, Socio socio, Date fechaDePago, Date fechaDeVencimiento) {
        this.monto = monto;
        this.metodoDePago = metodoDePago;
        this.socio = socio;
        this.fechaDePago = fechaDePago;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

    public String getMetodoDePago() { return metodoDePago; }
    public void setMetodoDePago(String metodoDePago) { this.metodoDePago = metodoDePago; }

    public Socio getSocio() { return socio; }
    public void setSocio(Socio socio) { this.socio = socio; }

    public Date getFechaDePago() { return fechaDePago; }
    public void setFechaDePago(Date fechaDePago) { this.fechaDePago = fechaDePago; }

    public Date getFechaDeVencimiento() { return fechaDeVencimiento; }
    public void setFechaDeVencimiento(Date fechaDeVencimiento) { this.fechaDeVencimiento = fechaDeVencimiento; }
}

