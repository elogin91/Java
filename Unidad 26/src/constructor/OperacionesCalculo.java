package constructor;

import java.util.Scanner;

/*
 * Implementar la clase operaciones. Se deben cargar dos valores enteros en el constructor, 
 * calcular su suma, resta, multiplicaci�n y divisi�n, cada una en un m�todo, imprimir dichos resultados.
 */
public class OperacionesCalculo {
	private Scanner teclado;
	int valor1, valor2;

	public OperacionesCalculo() {
		teclado = new Scanner(System.in);
		System.out.print("Ingrese primer valor:");
		valor1 = teclado.nextInt();
		System.out.print("Ingrese segundo valor:");
		valor2 = teclado.nextInt();
	}

	public void sumar() {
		int suma;
		suma = valor1 + valor2;
		System.out.println("La suma es:" + suma);
	}

	public void restar() {
		int resta;
		resta = valor1 - valor2;
		System.out.println("La resta es:" + resta);
	}

	public void multiplicar() {
		int multiplicacion;
		multiplicacion = valor1 * valor2;
		System.out.println("La multiplicaci�n es:" + multiplicacion);
	}

	public void dividir() {
		int division;
		division = valor1 / valor2;
		System.out.println("La divisi�n es:" + division);
	}

	public static void main(String[] ar) {
		OperacionesCalculo opera = new OperacionesCalculo();
		opera.sumar();
		opera.restar();
		opera.multiplicar();
		opera.dividir();
	}
}