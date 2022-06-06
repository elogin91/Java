package examenPenultimo;

import java.util.Scanner;

public class Empleado extends Persona {
	String telefono;

	public void cargarTelefono() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("-----------Cargando n� de tel�fono del empleado--------------");
		System.out.println("Ingrese el n�mero de tel�fono: ");
		telefono = teclado.nextLine();
	}

	public void imprimirTelefono() {
		System.out.println("-----------Imprimiendo n� de tel�fono del empleado--------------");
		System.out.println("El n�mero de telefono del empleado es: " + telefono);
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
