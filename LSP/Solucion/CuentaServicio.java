package Solucion;

import java.util.List;

import Problema.CuentaComun;

public class CuentaServicio {
	 public void interesesDiarios(List<Solucion.CuentaComun> cuentass) {
		 for (Solucion.CuentaComun  cuenta : cuentass) {
	            cuenta.intereses();
	            cuenta.comisionesPorTarjeta();
	       }
	 }
	 
	 
}
