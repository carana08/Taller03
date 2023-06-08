package Problema;
import java.util.ArrayList;


import java.util.List;
public class LSPProblema {
	public static void main(String[] args) {
        List<CuentaComun> cuenta = new ArrayList<>();
        CuentaServicio servicio = new CuentaServicio();

        cuenta.add(new CuentaComun(6000d));
        cuenta.add(new CuentaEstudiante(20000d));

        servicio.interesesDiarios(cuenta);
    }
}
