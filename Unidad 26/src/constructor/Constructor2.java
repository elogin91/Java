package constructor;

import java.util.Scanner;

/*
 * Plantear una clase llamada Alumno y definir como atributos su nombre y su edad. 
 * En el constructor realizar la carga de datos. Definir otros dos métodos para imprimir los datos ingresados y un
 *  mensaje si es mayor o no de edad (edad >=18)
 */
public class Constructor2 {
	private Scanner teclado;
	private String nombre;
	private int edad;

	public Constructor2() {
		teclado = new Scanner(System.in);
		System.out.print("Ingrese nombre:");
		nombre = teclado.next();
		System.out.print("Ingrese edad:");
		edad = teclado.nextInt();
	}

	public void imprimir() {
		System.out.println("Nombre:" + nombre);
		System.out.println("Edad:" + edad);
	}

	public void esMayorEdad() {
		if (edad >= 18) {
			System.out.print(nombre + " es mayor de edad.");
		} else {
			System.out.print(nombre + " no es mayor de edad.");
		}
	}

	public static void main(String[] ar) {
		Constructor2 alumno1 = new Constructor2();
		alumno1.imprimir();
		alumno1.esMayorEdad();
	}
}
