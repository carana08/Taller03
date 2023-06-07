package Solucion;

public class ValidarEmail {
	public static void validar(String correo) {
	if(!correo.contains("@")) {
		throw new RuntimeException("El correo debe contener el '@'");
	}
	}
}
