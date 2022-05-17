package ejercicio1.copy;

import java.util.Comparator;

public class AlumnoNotaComparator implements Comparator<Alumno>{

	@Override
	public int compare(Alumno alumno1, Alumno alumno2) {
		return alumno2.getNota() - alumno1.getNota();
	}
}
