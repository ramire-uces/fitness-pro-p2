package ProgramacionII.Actividad_2;

import java.util.Date;

class MembresiaVIP extends Membresia {
    private String beneficiosVIP;

    public MembresiaVIP() {
        this.beneficiosVIP = "";
    }

    public MembresiaVIP(Socio socio, Date fechaDeVencimiento, String beneficiosVIP) {
        super(socio, fechaDeVencimiento);
        this.beneficiosVIP = beneficiosVIP;
    }

    public String getBeneficiosVIP() { return beneficiosVIP; }
    public void setBeneficiosVIP(String beneficiosVIP) { this.beneficiosVIP = beneficiosVIP; }
}

