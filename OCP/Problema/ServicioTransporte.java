package Problema;


public class ServicioTransporte {
	public void viaje(FormaDeTransporte transporte) {
		switch(transporte.getTransViaje()) {
		case CARRO:
			System.out.println("El pago por viajar en auto es: "+transporte.getValor());
			break;
		case AVION:
			System.out.println("El pago por viajar en avión es: "+transporte.getValor());
			break;
			
		}
		
		
	}

}
