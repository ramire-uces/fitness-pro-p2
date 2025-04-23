package com.renterias.modelo;

import java.util.UUID;

public abstract class Empleado {
    private String empleadoId;
    private String nombre;
    private String cargo;
    private double sueldo;

    protected Empleado() {}

    protected Empleado(String nombre, String cargo, double sueldo) {
        this.empleadoId = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getEmpleadoId() { return empleadoId; }
    public void setEmpleadoId(String empleadoId) { this.empleadoId = empleadoId; }

    public String nombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String cargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double sueldo() { return sueldo; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }
}
