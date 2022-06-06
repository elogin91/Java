package examenPenultimo;

import java.util.Scanner;

public class Empleado extends Persona {
	String telefono;

	public void cargarTelefono() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("-----------Cargando nº de teléfono del empleado--------------");
		System.out.println("Ingrese el número de teléfono: ");
		telefono = teclado.nextLine();
	}

	public void imprimirTelefono() {
		System.out.println("-----------Imprimiendo nº de teléfono del empleado--------------");
		System.out.println("El número de telefono del empleado es: " + telefono);
	}

	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.cargarDatos();
		persona.imprimir();

		Empleado empleado = new Empleado();
		empleado.cargarTelefono();
		empleado.imprimirTelefono();
	}
}
