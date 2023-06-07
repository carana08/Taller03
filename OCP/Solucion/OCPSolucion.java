package Solucion;

public class OCPSolucion {
	public static void main(String arg[]) {
		ServicioTransporte servicio = new ServicioTransporte();
		
		Transporte carro = new TransporteCarro();
		Transporte avion = new TransporteAvion();
		
		servicio.viaje(new FormaDeTransporte(35.85),carro);
		servicio.viaje(new FormaDeTransporte(385.67),avion);
		
	}
}
