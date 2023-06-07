package Problema;

public class OCPProblema {
	public static void main(String arg[]) {
		ServicioTransporte servicio = new ServicioTransporte();
		
		servicio.viaje(new FormaDeTransporte(Transporte.CARRO, 35.85));
		servicio.viaje(new FormaDeTransporte(Transporte.AVION, 385.67));
		
	}
}
