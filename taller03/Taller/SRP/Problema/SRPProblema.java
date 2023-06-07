package paquete;

public class SRPProblema {
	 public static void main(String[] args) {
	       Estudiante estudiante = new estudainte() {{
	            setDocument("11111111");
	            setEmail("prueba@institucion.edu.com");
	        }};

	        try {

	            estudiante.save();
	            System.out.println("Client saved successfully");

	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        }
	    }
}
