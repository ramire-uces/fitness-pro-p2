package com.renterias.modelo;

public class Entrenador extends Empleado {
    private String email;
    private String horarioDisponible;

    public Entrenador() {}

    public Entrenador(String nombre, String cargo, double sueldo, String email, String horarioDisponible) {
        super(nombre, cargo, sueldo);
        this.email = email;
        this.horarioDisponible = horarioDisponible;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getHorarioDisponible() { return horarioDisponible; }
    public void setHorarioDisponible(String horarioDisponible) { this.horarioDisponible = horarioDisponible; }
}

