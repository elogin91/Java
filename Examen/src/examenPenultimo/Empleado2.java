package examenPenultimo;

import java.util.Scanner;

public class Empleado2 extends Persona {
	String direccion;
	String telefono;

	@Override
	public void cargarDatos() {
		super.cargarDatos();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la dirección: ");
		direccion = teclado.nextLine();
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("La dirección del empleado es: " + direccion);
	}

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

		Empleado2 empleado = new Empleado2();
		empleado.cargarDatos();
		empleado.cargarTelefono();
		empleado.imprimir();
		empleado.imprimirTelefono();
	}
}
