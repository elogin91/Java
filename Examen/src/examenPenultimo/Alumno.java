package examenPenultimo;

import java.util.Scanner;

public class Alumno {

	String nombre;
	
	float calificaci�n;
	
	public Alumno () {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el nombre del alumno: ");
		nombre = teclado.nextLine();
		System.out.println("Ingrese la calificaci�n del alumno: ");
		calificaci�n = teclado.nextFloat();
		teclado.close();

	}
	
	public void imprimir() {
		System.out.println("Nombre del alumno: " + nombre);
		System.out.println("Calificaci�n: " + calificaci�n);

	}
	
	public void resultadoCalificacion () {
		if (this.calificaci�n >= 5) {
			System.out.println("El alumno " + nombre + " ha aprobado con una calificaci�n de " + calificaci�n);
		}
		else {
			System.out.println("El alumno " + nombre + " NO ha probado, su calificaci�n es: " + calificaci�n);
		}
	}
	
	public static void main(String[] ar) {
		Alumno alumno1 = new Alumno();
		alumno1.imprimir();
		alumno1.resultadoCalificacion();
	}

}
