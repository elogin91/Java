package ejercicio1.copy.copy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class OrdenarNotas {

	private Scanner datos;
	private Alumno[] alumnos;

	public void cargar() {
		datos = new Scanner(System.in);
		alumnos = new Alumno[5];
		System.out.println("Carga de nombres y notas de los alumnos.");
		for (int f = 0; f < alumnos.length; f++) {
			System.out.print("Ingrese el nombre del alumno:");
			String nombre = datos.next();
			System.out.print("Ingrese la nota del alumno:");
			int nota = datos.nextInt();
			alumnos[f] = new Alumno(nombre, nota);
		}
	}

	public void ordenar() {
		for (int k = 0; k < alumnos.length; k++) {
			for (int f = 0; f < alumnos.length - 1 - k; f++) {
				if (alumnos[f].getNota() < alumnos[f + 1].getNota()) {
					Alumno auxAlumno = alumnos[f];
					alumnos[f] = alumnos[f + 1];
					alumnos[f + 1] = auxAlumno;
				}
			}
		}
	}

	public void ordenar2() {
		Arrays.sort(alumnos, new AlumnoNotaComparator());
	}

	public void ordenar3() {
		Arrays.sort(alumnos, new Comparator<Alumno>() {
			@Override
			public int compare(Alumno o1, Alumno o2) {
				return o2.getNota() - o1.getNota();
			}
		});
	}

	public void ordenar4() {
		Arrays.sort(alumnos, (o1, o2) -> o2.getNota() - o1.getNota());
	}
	
	public void ordenar1() {
		Arrays.sort(alumnos, Collections.reverseOrder());
	}

	public void imprimir() {
		System.out.println("Nombres de alumnos y notas de mayor a menor");
		for (int f = 0; f < alumnos.length; f++) {
			System.out.println(alumnos[f].toString());
		}
	}

	public static void main(String[] ar) {
		OrdenarNotas alumnos = new OrdenarNotas();
		alumnos.cargar();
		alumnos.imprimir();
		alumnos.ordenar();
		alumnos.imprimir();
		alumnos.ordenar2();
		alumnos.imprimir();
	}
}
