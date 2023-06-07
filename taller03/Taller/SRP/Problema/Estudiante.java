package Problema;
import java.io.FileWriter;
import java.io.IOException;
public class Estudiante {
	private String correo;
	private int materias;
	private String documento;
	
	public void registrar() {
		if(!correo.contains("@")) {
			throw new RuntimeException("El correo debe contener el '@'");
		}
		if(materias<=0 || materias>15) 
			throw new RuntimeException("El estudiante no es regular");	
		FileWriter file; 
	
	try {
        file = new FileWriter("database.txt");
        file.write(this.toString());
        file.close();
    } catch (IOException e) {
        throw new RuntimeException("No se puede guardar el estudiante", e);
    }
}
	@Override
	public String toString() {
	    return String.format("%s -|- %s ", correo, documento);
	}
	
    public void setCorreo(String correo) {
        this.correo=correo;
    }
}

	

