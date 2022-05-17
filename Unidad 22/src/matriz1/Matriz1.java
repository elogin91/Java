package matriz1;

import java.util.Scanner;

/**
 * 
 * Crear una matriz de 3 filas por 5 columnas con elementos de tipo int, cargar
 * sus componentes y luego imprimirlas.
 *
 */
public class Matriz1 {
	private int[][] matriz = new int[3][5];

	public void cargar() {
		Scanner teclado =new Scanner(System.in);
		try  {
			for (int f = 0; f < 3; f++) {
				for (int c = 0; c < 5; c++) {
					System.out.print("Ingrese componente:");
					matriz[f][c] = teclado.nextInt();
				}
			}
		}
		finally {
			teclado.close();
		}
	}

	public void imprimir() {
		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 5; c++) {
				System.out.print(matriz[f][c] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] ar) {
		Matriz1 ma = new Matriz1();
		ma.cargar();
		ma.imprimir();
	}
}
