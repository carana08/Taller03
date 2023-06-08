package Solucion;

import Solucion.CuentaComun;

public class CuentaEstudiante extends CuentaComun {
    private double limite;

    public CuentaEstudiante(double saldoInicial, double limite) {
        super(saldoInicial);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
