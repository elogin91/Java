package ejercicio4;

import java.util.Scanner;

/*
 * Confeccionar un programa que permita crear una matriz irregular y luego imprimir la matriz en forma completa.
 */
public class ImprimirMatriz {

	private Scanner teclado = new Scanner(System.in);;
	private int[][] matriz;

	public void cargar() {
		System.out.print("Introduzca las filas que tiene la matriz:");
		int filas = teclado.nextInt();
		System.out.print("Introduzca las columnas que tiene la matriz:");
		int columnas = teclado.nextInt();
		matriz = new int[filas][columnas];
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[f].length; c++) {
				System.out.print("Introduzca los datos de la celda [" + (f + 1) + "][" + (c + 1) + "]:");
				matriz[f][c] = teclado.nextInt();
			}
		}
	}

	public void imprimir() {
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[f].length; c++) {
				System.out.print(matriz[f][c] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] ar) {
		ImprimirMatriz miMatriz = new ImprimirMatriz();
		miMatriz.cargar();
		miMatriz.imprimir();

	}
}