package ProgramacionII.Actividad_2;

import java.util.Date;

class Socio extends Usuario {
    private String nombre;
    private Direccion direccion;
    private Telefono telefono;
    private String email;
    private boolean membresia;

    public Socio() {}

    public Socio(String userId, String password, Date fechaDeRegistro, String nombre, Direccion direccion, Telefono telefono, String email, boolean membresia) {
        super(userId, password, fechaDeRegistro);
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.membresia = membresia;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    public Telefono getTelefono() { return telefono; }
    public void setTelefono(Telefono telefono) { this.telefono = telefono; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isMembresia() { return membresia; }
    public void setMembresia(boolean membresia) { this.membresia = membresia; }
}

