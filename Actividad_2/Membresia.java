package ProgramacionII.Actividad_2;

import java.util.Date;

class Membresia {
    private Socio socio;
    private Date fechaDeVencimiento;

    public Membresia() {
        this.fechaDeVencimiento = new Date();
    }

    public Membresia(Socio socio, Date fechaDeVencimiento) {
        this.socio = new Socio();
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public String getSocioId() { return socio.getUserId(); }
    public void setSocio(Socio socio) { this.socio = socio; }

    public Date getFechaDeVencimiento() { return fechaDeVencimiento; }
    public void setFechaDeVencimiento(Date fechaDeVencimiento) { this.fechaDeVencimiento = fechaDeVencimiento; }
}

