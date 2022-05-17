package ejercicio2;

import java.util.Scanner;

/**
 * 
 * Crear y cargar una matriz de 3 filas por 4 columnas. Imprimir la primer fila.
 * Imprimir la última fila e imprimir la primer columna.
 *
 */
public class Matriz {

	private Scanner teclado;
	private int[][] mat;

	public void cargar() {
		teclado = new Scanner(System.in);
		mat = new int[3][4];
		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 4; c++) {
				System.out.print("Ingrese la celda[" + (f + 1) + "][" + (c + 1) + "]:");
				mat[f][c] = teclado.nextInt();
			}
		}
	}

	public void primerFila() {
		System.out.println("Primer fila de la matriz:");
		for (int c = 0; c < 4; c++) {
			System.out.print(mat[0][c] + " ");
		}
		System.out.println();
	}

	public void ultimaFila() {
		System.out.println("Ultima fila de la matriz:");
		for (int c = 0; c < 4; c++) {
			System.out.print(mat[2][c] + " ");
		}
		System.out.println();
	}

	public void primerColumna() {
		System.out.println("Primera columna:");
		for (int f = 0; f < 3; f++) {
			System.out.println(mat[f][0]);
		}
	}

	public static void main(String[] ar) {
		Matriz miMatriz = new Matriz();
		miMatriz.cargar();
		miMatriz.primerFila();
		miMatriz.ultimaFila();
		miMatriz.primerColumna();
	}
}