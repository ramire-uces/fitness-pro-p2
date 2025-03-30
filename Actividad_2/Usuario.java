package ProgramacionII.Actividad_2;

import java.util.Date;
import java.util.UUID;

abstract class Usuario {
    private String userId;
    private String password;
    private Date fechaDeRegistro;

    protected Usuario() {
        this.userId = UUID.randomUUID().toString();
        this.fechaDeRegistro = new Date();
    }

    protected Usuario(String userId, String password, Date fechaDeRegistro) {
        this.userId = userId;
        this.password = password;
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Date getFechaDeRegistro() { return fechaDeRegistro; }
    public void setFechaDeRegistro(Date fechaDeRegistro) { this.fechaDeRegistro = fechaDeRegistro; }
}