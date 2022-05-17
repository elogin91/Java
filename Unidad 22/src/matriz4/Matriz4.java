package matriz4;

import java.util.Scanner;

/**
 * 
 * Crear una matriz de 2 filas y 5 columnas. Realizar la carga de componentes
 * por columna (es decir primero ingresar toda la primer columna, luego la
 * segunda columna y así sucesivamente) Imprimir luego la matriz.
 *
 */
public class Matriz4 {
	private final static int ROWS = 2, COLUMNS = 5;

	private int[][] matriz = new int[ROWS][COLUMNS];

	private void cargarDatos() {
		try (Scanner teclado = new Scanner(System.in)) {
			for (int columna = 0; columna < COLUMNS; columna++) {
				for (int fila = 0; fila < ROWS; fila++) {
					System.out.print("Ingrese el elemento " + (fila + 1) + "º de la columna " + (columna + 1) + ":");
					matriz[fila][columna] = teclado.nextInt();
				}
			}
		}
	}

	private void imprimirDatos() {
		for (int fila = 0; fila < ROWS; fila++) {
			for (int columna = 0; columna < COLUMNS; columna++) {
				if(columna > 0) {
					System.out.print("-");
				}
				System.out.print(matriz[fila][columna]);
			}
			System.out.println(" ");
		}
	}

	static public void main(String[] args) {
		Matriz4 miMatriz = new Matriz4();
		miMatriz.cargarDatos();
		miMatriz.imprimirDatos();
	}
}