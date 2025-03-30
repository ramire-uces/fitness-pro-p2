package ProgramacionII.Actividad_2;

class Mantenimiento {
    private Equipo equipo;
    private String fechaDeMantenimiento;
    private double costoDelMantenimiento;

    public Mantenimiento() {}

    public Mantenimiento(Equipo equipo, String fechaDeMantenimiento, double costoDelMantenimiento) {
        this.equipo = equipo;
        this.fechaDeMantenimiento = fechaDeMantenimiento;
        this.costoDelMantenimiento = costoDelMantenimiento;
    }

    public Equipo getEquipo() { return equipo; }
    public void setEquipo(Equipo equipo) { this.equipo = equipo; }

    public String getFechaDeMantenimiento() { return fechaDeMantenimiento; }
    public void setFechaDeMantenimiento(String fechaDeMantenimiento) { this.fechaDeMantenimiento = fechaDeMantenimiento; }

    public double getCostoDelMantenimiento() { return costoDelMantenimiento; }
    public void setCostoDelMantenimiento(double costoDelMantenimiento) { this.costoDelMantenimiento = costoDelMantenimiento; }

    public String getIdEquipo() {
        return equipo.getIdEquipo();
    }
}



