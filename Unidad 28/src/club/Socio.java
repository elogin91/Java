package club;

import java.util.Scanner;

public class Socio {
	private String nombre;
	private int antiguedad;
	public Socio(Scanner teclado) {

		System.out.print("Introduzca nombre del socio: ");
		nombre=teclado.next();
		System.out.print("Introduzca la antigüedad del socio: ");
		antiguedad=teclado.nextInt();
	}
	public void imprimirNombre() {
		System.out.print(nombre);
	}	
	public int retornarAntiguedad() {
		return antiguedad;
	}

}
