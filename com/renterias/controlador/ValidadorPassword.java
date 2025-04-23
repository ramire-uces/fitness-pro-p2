package com.renterias.controlador;

// Función recursiva
public class ValidadorPassword {

    public static boolean contieneMayuscula(String password, int i) {
        if (i >= password.length()) return false;
        if (Character.isUpperCase(password.charAt(i))) return true;
        return contieneMayuscula(password, i + 1);
    }

    public static boolean contieneNumero(String password, int i) {
        if (i >= password.length()) return false;
        if (Character.isDigit(password.charAt(i))) return true;
        return contieneNumero(password, i + 1);
    }

    public static boolean esPasswordValida(String password) {
        return contieneMayuscula(password, 0) && contieneNumero(password, 0);
    }
}