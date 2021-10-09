package personas;

import centroComputos.ColaEspera;


public class Facultad {
    ColaEspera alumnos;

    public Facultad() {
        alumnos = new ColaEspera();
    }

    public void addAlumno(Alumno alumno){
        alumnos.addElemento(alumno);
    }
}
