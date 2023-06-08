package Solucion;

import java.util.ArrayList;
import java.util.List;

public class LSPSolucion {
	public static void main(String[] args) {
        List<CuentaComun> cuenta = new ArrayList<CuentaComun>();
        CuentaServicio servicio = new CuentaServicio();

        cuenta.add(new CuentaComun(6000d));
        cuenta.add(new CuentaEstudiante(20000d,5000000d));

        servicio.interesesDiarios(cuenta);
    }
}
