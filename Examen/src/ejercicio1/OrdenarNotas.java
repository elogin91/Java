package ejercicio1;

import java.util.Scanner;

public class OrdenarNotas {

	private Scanner datos;
	private String[] nombres;
	private int[] notas;

	public void cargar() {
		datos = new Scanner(System.in);
		nombres = new String[5];
		notas = new int[5];
		System.out.println("Carga de nombres y notas de los alumnos.");
		for (int f = 0; f < nombres.length; f++) {
			System.out.print("Ingrese el nombre del alumno:");
			nombres[f] = datos.next();
			System.out.print("Ingrese la nota del alumno:");
			notas[f] = datos.nextInt();
		}
	}

	public void ordenar() {
		for (int k = 0; k < notas.length; k++) {
			for (int f = 0; f < notas.length - 1 - k; f++) {
				if (notas[f] < notas[f + 1]) {
					int auxnota = notas[f];
					notas[f] = notas[f + 1];
					notas[f + 1] = auxnota;
					String auxnombre = nombres[f];
					nombres[f] = nombres[f + 1];
					nombres[f + 1] = auxnombre;
				}
			}
		}
	}

	public void imprimir() {
		System.out.println("Nombres de alumnos y notas de mayor a menor");
		for (int f = 0; f < notas.length; f++) {
			System.out.println(nombres[f] + " - " + notas[f]);
		}
	}

	public static void main(String[] ar) {
		OrdenarNotas alumnos = new OrdenarNotas();
		alumnos.cargar();
		alumnos.ordenar();
		alumnos.imprimir();
	}
}
