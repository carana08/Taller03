package Solucion;

public class CuentaComun {
	private double balance;

    public CuentaComun(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void intereses() {
        //
    }
    
    public void comisionesPorTarjeta() {
        //
    }
}
