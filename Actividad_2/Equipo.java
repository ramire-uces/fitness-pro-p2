package ProgramacionII.Actividad_2;

import java.util.UUID;

class Equipo {
    private String idEquipo;
    private String estado;
    private boolean mantenimientoRequerido;

    public Equipo() {
        this.idEquipo = UUID.randomUUID().toString();
        this.estado = "";
        this.mantenimientoRequerido = false;
    }

    public Equipo(String idEquipo, String estado, boolean mantenimientoRequerido) {
        this.idEquipo = idEquipo;
        this.estado = estado;
        this.mantenimientoRequerido = mantenimientoRequerido;
    }

    public String getIdEquipo() { return idEquipo; }
    public void setIdEquipo(String idEquipo) { this.idEquipo = idEquipo; }

    public boolean isMantenimientoRequerido() { return mantenimientoRequerido; }
    public void setMantenimientoRequerido(boolean mantenimientoRequerido) { this.mantenimientoRequerido = mantenimientoRequerido; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
