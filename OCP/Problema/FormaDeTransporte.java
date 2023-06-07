package Problema;

public class FormaDeTransporte {
	private Transporte transViaje;
	private double valor;
	
	public FormaDeTransporte(Transporte transViaje, double valor) {
		setTransporte(transViaje);
		setValor(valor);
		
	}

	public Transporte getTransViaje() {
		return transViaje;
	}

	public void setTransporte(Transporte transViaje) {
		this.transViaje = transViaje;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
