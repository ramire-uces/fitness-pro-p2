package com.renterias.modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Clase {
    private Entrenador entrenador;
    private int capacidadDeLaClase;
    private Date horarioDeLaClase;
    private List<Socio> sociosAnotados;

    public Clase() {}

    public Clase(Entrenador entrenador, int capacidadDeLaClase, Date horarioDeLaClase) {
        this.entrenador = entrenador;
        this.capacidadDeLaClase = capacidadDeLaClase;
        this.horarioDeLaClase = horarioDeLaClase;
        this.sociosAnotados = new ArrayList<>();
    }

    public Entrenador getEntrenador() { return entrenador; }
    public void setEntrenador(Entrenador entrenador) { this.entrenador = entrenador; }

    public int getCapacidadDeLaClase() { return capacidadDeLaClase; }
    public void setCapacidadDeLaClase(int capacidadDeLaClase) { this.capacidadDeLaClase = capacidadDeLaClase; }

    public Date getHorarioDeLaClase() { return horarioDeLaClase; }
    public void setHorarioDeLaClase(Date horarioDeLaClase) { this.horarioDeLaClase = horarioDeLaClase; }

    public List<Socio> getSociosAnotados() { return sociosAnotados; }

    public void agregarSocio(Socio socio) { sociosAnotados.add(socio); }

    // Segunda función recursiva
    public void verSociosAnotados(int i) {
        if (i >= sociosAnotados.size()) return;

        Socio socio = sociosAnotados.get(i);

        try (FileWriter writer = new FileWriter("com/renterias/main/socios_anotados_clase.txt", true)) {
            writer.write(socio.getNombre() + ", " + socio.getUserId() + "\n");
        } catch (IOException error) {
            System.out.println("Error al escribir el archivo.");
        }
        verSociosAnotados(i + 1);
    }
}



