package Solucion;

public class ValidadorMaterias {
	public static void validar(int materias) {
        if ( materias<=0 || materias>15)
            throw new RuntimeException("El estudiante no es regular");
    }

}
