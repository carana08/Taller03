package Solucion;

public class ServicioEstudiante {
	private RepositorioEstudiante repos;

    public ServicioEstudiante() {
        repos = new RepositorioEstudiante();
    }

    public boolean save(Estudiante estudiante) {
        try {

            estudiante.validar();
            repos.registro(estudiante);
            return true;

        } catch (RuntimeException e) {
            e.printStackTrace();
            return false;
        }
    }

}
