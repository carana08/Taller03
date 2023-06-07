package Solucion;

import java.io.FileWriter;
import java.io.IOException;

public class RepositorioEstudiante {
	public void registro(Estudiante estudiante) {
        FileWriter file;

        try {
            file = new FileWriter("database.txt");
            file.write(estudiante.toString());
            file.close();
        } catch (IOException e) {
            throw new RuntimeException("No se puede guardar el estudiante", e);
        }
    }


}
