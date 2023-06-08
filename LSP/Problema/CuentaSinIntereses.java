package Problema;
public class CuentaSinIntereses extends CuentaComun {

    public CuentaSinIntereses(double balance) {
        super(balance);
    }

    @Override
    public void intereses() {
        // No permite aplicar intereses diarios
    }
}