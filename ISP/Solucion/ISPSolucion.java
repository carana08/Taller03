package Solucion;

import java.util.ArrayList;
import java.util.List;

import Problema.Empleado;
import Problema.Empleados;


public class ISPSolucion {
	public static void main(String[] args) {
        List<EmpEst> empleados = new ArrayList<>();
        empleados.add(new EmpEst());


        for (EmpEst empleado : empleados) {
            empleado.horasdetrabajo();
            empleado.tiempoextra(3);

        }
    }
}
