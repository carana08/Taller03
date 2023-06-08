package Problema;
import java.util.ArrayList;
import java.util.List;
public class ISPProblema {
	public static void main(String[] args) {
        List<Empleados> empl = new ArrayList<>();
        empl.add(new Empleados("Katherine",450));


        for (Empleados empleado : empl ) {
            empleado.tiempoextra();
            empleado.salario();
            empleado.fondosdereserva();

        }
    }
}
