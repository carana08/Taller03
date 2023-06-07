package Solucion;
public class Estudiante {
	private String correo;
	private int materias;
	private String documento;
	
	public void validar() {
		ValidarEmail.validar(correo);
		ValidadorMaterias.validar(materias);
}
	@Override
	public String toString() {
	    return String.format("%s -|- %s ", correo, documento);
	}
	
    public void setCorreo(String correo) {
        this.correo=correo;
    }
}