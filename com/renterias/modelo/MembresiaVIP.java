package com.renterias.modelo;

public class MembresiaVIP extends Membresia {
    private String beneficiosVIP;

    public MembresiaVIP() {
        this.beneficiosVIP = "";
    }

    public MembresiaVIP(Socio socio, String beneficiosVIP) {
        super(socio);
        this.beneficiosVIP = beneficiosVIP;
    }

    public String getBeneficiosVIP() { return beneficiosVIP; }
    public void setBeneficiosVIP(String beneficiosVIP) { this.beneficiosVIP = beneficiosVIP; }
}

