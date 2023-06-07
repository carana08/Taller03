package Solucion;

public class TransporteCarro implements Transporte {
	@Override
	public void viaje(double valor) {
		System.out.println("El valor a pagar por usar un carro es: "+valor);
		
	}
}