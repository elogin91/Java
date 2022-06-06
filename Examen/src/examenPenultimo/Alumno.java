package examenPenultimo;

import java.util.Scanner;

public class Alumno {

	String nombre;
	
	float calificación;
	
	public Alumno () {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el nombre del alumno: ");
		nombre = teclado.nextLine();
		System.out.println("Ingrese la calificación del alumno: ");
		calificación = teclado.nextFloat();
		teclado.close();

	}
	
	public void imprimir() {
		System.out.println("Nombre del alumno: " + nombre);
		System.out.println("Calificación: " + calificación);

	}
	
	public void resultadoCalificacion () {
		if (this.calificación >= 5) {
			System.out.println("El alumno " + nombre + " ha aprobado con una calificación de " + calificación);
		}
		else {
			System.out.println("El alumno " + nombre + " NO ha probado, su calificación es: " + calificación);
		}
	}
	
	public static void main(String[] ar) {
		Alumno alumno1 = new Alumno();
		alumno1.imprimir();
		alumno1.resultadoCalificacion();
	}

}
