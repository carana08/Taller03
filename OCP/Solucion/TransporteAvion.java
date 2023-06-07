package Solucion;

public class TransporteAvion implements Transporte {
	@Override
	public void viaje(double valor) {
		System.out.println("El valor a pagar por usar un avión es: "+valor);
		
	}
}
