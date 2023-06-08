package Problema;

import java.util.List;

public class CuentaServicio {
	 public void interesesDiarios(List<CuentaComun> cuentas) {
		 for (CuentaComun cuenta : cuentas) {
	            cuenta.intereses();
	            cuenta.comisionesPorTarjeta();
	       }
	 }
}
