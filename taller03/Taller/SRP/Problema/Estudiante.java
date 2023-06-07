package Problema;

import java.io.FileWriter;
import java.io.IOException;

public class Estudiante {
	private String correo;
	private int materias;
	private String documento;
	
	public void registrar() {
		if(!correo.contains("@")) {
			throw new RuntimeException("Email debe contener el '@'");
		}
		if(materias==0) 
			throw new RuntimeException("Debe estar registrado en al menos 1 clase");
			
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

    public String getEmail() {
        return correo;
    }
		
	}
	

