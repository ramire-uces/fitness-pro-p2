package com.renterias.modelo;

import java.util.ArrayList;
import java.util.List;

public class Finanzas {
    private List<Pago> pagos;

    public Finanzas() {
        this.pagos = new ArrayList<>();
    }

    public void registrarPago(Pago pago) {
        pagos.add(pago);
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public double calcularTotalIngresos() {
        return pagos.stream().mapToDouble(Pago::getMonto).sum();
    }
}

