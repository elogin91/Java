package examenPenultimo;

import java.util.Scanner;

public class Persona {
	String nombre, dni;
	
	public void cargarDatos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("-----------Cargando datos de identificación--------------");
		System.out.println("Ingrese el nombre de la persona: ");
		nombre = teclado.nextLine();
		System.out.println("Ingrese el DNI de la persona: ");
		dni = teclado.nextLine();
	}
	
	public void imprimir() {
		System.out.println("-----------Imprimiendo datos de identificación--------------");
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
	}
}
