package ejercicio1.copy;

public class Alumno implements Comparable<Alumno>{
	private String nombre;
	private int nota;

	public int getNota() {
		return nota;
	}

	public Alumno(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return nombre + " - " + nota;
	}

	@Override
	public int compareTo(Alumno other) {
		return this.nota - other.nota;
	}
}
