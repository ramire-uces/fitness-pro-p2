package com.renterias.main;

import java.util.Date;
import java.util.Scanner;

import com.renterias.modelo.Direccion;
import com.renterias.modelo.Socio;
import com.renterias.modelo.Telefono;
import com.renterias.controlador.ValidadorPassword;
import com.renterias.modelo.Entrenador;
import com.renterias.modelo.Clase;
import com.renterias.modelo.Reserva;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Registro de socio
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nRegistro de Socio para gimnasio FitnessPro\n");

        System.out.print("Nombre completo: ");
        String nombre = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        String password;
        do {
            System.out.print("Cree una contraseña (al menos una mayúscula y un número): ");
            password = scanner.nextLine();

            if (!ValidadorPassword.esPasswordValida(password)) {
                System.out.println("La contraseña requiere al menos una mayúscula y un número.");
            }
        } while (!ValidadorPassword.esPasswordValida(password));


        System.out.print("Calle: ");
        String calle = scanner.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.print("Estado: ");
        String estado = scanner.nextLine();

        int codigoPostal = 0;
        while (true) {
            try {
                System.out.print("Código Postal: ");
                codigoPostal = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException error) {
                System.out.println("El código postal debe ser un número válido.");
            }
        }
        Direccion direccion = new Direccion(calle, ciudad, codigoPostal, estado);

        System.out.print("Tipo de teléfono: ");
        String tipo = scanner.nextLine();

        String numero = "";
        while (true) {
            try {
                System.out.print("Número de teléfono: ");
                numero = scanner.nextLine();
            
                new Telefono(numero, tipo);
                break;
            } catch (IllegalArgumentException error) {
                System.out.println("El teléfono debe estar compuesto solo por números.");
            }
        }
            

        Telefono telefono = new Telefono(numero, tipo);

        Socio nuevoSocio = new Socio(
            password,
            new Date(),
            nombre,
            direccion,
            telefono,
            email
        );

        try {
            FileWriter writer = new FileWriter("com/renterias/main/socios.txt", true);
            writer.write("Nombre: " + nuevoSocio.getNombre() + "\n");
            writer.write("Email: " + nuevoSocio.getEmail() + "\n");
            writer.write("ID: " + nuevoSocio.getUserId() + "\n");
            writer.write("Fecha de registro: " + nuevoSocio.getFechaDeRegistro() + "\n");
            writer.write("Direccion: " + nuevoSocio.getDireccion().getCalle() + ", " +
                         nuevoSocio.getDireccion().getCiudad() + ", " +
                         nuevoSocio.getDireccion().getCodigoPostal() + ", " +
                         nuevoSocio.getDireccion().getEstado() + "\n");
            writer.write("Telefono: " + nuevoSocio.getTelefono().getNumero() + " (" +
                         nuevoSocio.getTelefono().getTipo() + ")\n");
            writer.write("Fecha de vencimiento de la membresia: " +
                         nuevoSocio.getMembresia().getFechaDeVencimiento() + "\n");
            writer.write("-------------------------------------\n");
            writer.close();
        
            System.out.println("Socio registrado con éxito.");
        } catch (IOException error) {
            System.out.println("Error al crear el socio.");
        }
        scanner.close();*/

        // Crear entrenadores y asignar socios a clases

        Entrenador entrenador = new Entrenador(
        "Juan", 
        "Entrenador", 
        1500, 
        "juanfitness@gmail.com", 
        "Lunes a viernes");

        Clase claseFitness = new Clase(entrenador, 1, new Date());

        Socio nuevoSocio = new Socio(
            "SocioPrueba1",
            new Date(),
            "Carlos",
            new Direccion("CallePrueba", "CiudadPrueba", 1234, "EstadoPrueba"),
            new Telefono("123456789", "Movil"),
            "carlos@gmail.com"
        );

        new Reserva(nuevoSocio, claseFitness, new Date());
        claseFitness.verSociosAnotados(0);
    }
}