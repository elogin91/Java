package matrizirregular;

import java.util.Scanner;

/*
 * Confeccionar una clase para administrar una matriz irregular de 5 filas y 1 columna la primer fila, 2 columnas la segunda fila y as� sucesivamente hasta 5 columnas la �ltima fila (crearla sin la intervenci�n del operador)
Realizar la carga por teclado e imprimir posteriormente.
 */
public class MatrizIrregular2 {
	private Scanner teclado;
	private int[][] mat;

	public void cargar() {
		teclado = new Scanner(System.in);
		mat = new int[5][];
		for (int f = 0; f < mat.length; f++) {
			mat[f] = new int[f + 1];
			for (int c = 0; c < mat[f].length; c++) {
				System.out.print("Ingrese componente:");
				mat[f][c] = teclado.nextInt();
			}
		}
	}

	public void imprimir() {
		for (int f = 0; f < mat.length; f++) {
			for (int c = 0; c < mat[f].length; c++) {
				System.out.print(mat[f][c] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] ar) {
		MatrizIrregular2 ma = new MatrizIrregular2();
		ma.cargar();
		ma.imprimir();
	}
}
