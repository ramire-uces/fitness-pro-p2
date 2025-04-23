package com.renterias.controlador;

import java.util.Date;
import com.renterias.modelo.Carnet;

public class ControlAcceso {
    private Carnet carnet;
    private Date horaEntrada;
    private Date horaSalida;

    public ControlAcceso() {}

    public ControlAcceso(Carnet carnet, Date horaEntrada, Date horaSalida) {
        this.carnet = carnet;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public Carnet getCarnet() { return carnet; }
    public void setCarnet(Carnet carnet) { this.carnet = carnet; }

    public Date getHoraEntrada() { return horaEntrada; }
    public void setHoraEntrada(Date horaEntrada) { this.horaEntrada = horaEntrada; }

    public Date getHoraSalida() { return horaSalida; }
    public void setHoraSalida(Date horaSalida) { this.horaSalida = horaSalida; }

    public boolean registrarEntrada(String codigoLeido, Carnet carnetRegistrado) {
        if (codigoLeido.equals(carnetRegistrado.getIdCarnet())) {
            if (carnetRegistrado.membresiaValida()) {
                this.carnet = carnetRegistrado;
                this.horaEntrada = new Date();
                System.out.println("Acceso permitido (" + horaEntrada + ")"); return true;
            } else {
                System.out.println("Acceso denegado."); return false;
            }
        } else {
            System.out.println("Acceso denegado."); return false;
        }
    } 
}

