package Problema;

public class SRPProblema {
	 public static void main(String[] args) {
	       Estudiante estudiante = new Estudiante() {{
	            setCorreo("prueba@institucion.edu.pais");
	        }};

	        try {
	            estudiante.registrar();
	            System.out.println("Estudiante registrado correctamente");

	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        }
	    }
}
