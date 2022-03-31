package infotriangulo;

import java.util.Scanner;

/*Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a la medida de la base y 
la altura de un triángulo. El programa deberá informar:
a) De cada triángulo la medida de su base, su altura y su superficie.
b) La cantidad de triángulos cuya superficie es mayor a 12.*/

public class infoTriangulo2 {
	public static void main(String[] ar) {

		try (Scanner teclado = new Scanner(System.in)) {
			int n, x, i, superficie, count = 0;

			System.out.println("¿Cuantos pares de datos vas a introducir?");
			n = teclado.nextInt();

			int base[] = new int[n];
			int altura[] = new int[n];

			/* Guardando los datos a utilizar */
			for (x = 0; x < n; x++) {
				System.out.println("Introduzca la base del triangulo número " + (x + 1));
				base[x] = teclado.nextInt();
				System.out.println("Introduzca la altura del triangulo número " + (x + 1));
				altura[x] = teclado.nextInt();
			}

			/* Utilizamos los datos guardados */
			for (i = 0; i < n; i++) {
				superficie = base[i] * altura[i] / 2;
				System.out.println("El triangulo " + (i + 1) + " tiene una base de " + base[i] + " , una altura de "
						+ altura[i] + " y una superficie de " + superficie + ".");
				if (superficie > 12) {
					count++;
				}
			}
			System.out.println("La cantidad de triangulos con superficie mayor de 12 son " + count + ".");
		}
	}
}
