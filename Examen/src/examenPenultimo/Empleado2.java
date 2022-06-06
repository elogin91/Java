package examenPenultimo;

import java.util.Scanner;

public class Empleado2 extends Persona {
	String direccion;
	String telefono;

	@Override
	public void cargarDatos() {
		super.cargarDatos();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la direcci�n: ");
		direccion = teclado.nextLine();
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("La direcci�n del empleado es: " + direccion);
	}

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

		Empleado2 empleado = new Empleado2();
		empleado.cargarDatos();
		empleado.cargarTelefono();
		empleado.imprimir();
		empleado.imprimirTelefono();
	}
}
