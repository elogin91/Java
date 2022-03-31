package tablamultiplicar;
import java.util.Scanner;

/*Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos muestre 
la tabla de multiplicar del mismo (los primeros 12 términos)
Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36*/
public class TablaMultiplicar {
	static public void main(String[] ar) {
		try (Scanner teclado = new Scanner(System.in)) {
			int number = 0;

			System.out.println("Por favor introduce un número del 1 al 10.");
			number = teclado.nextInt();

			if (number >= 1 && number <= 10) {
				for (int x = 0; x < 12; x++) {
					System.out.println(number + " x " + (x + 1) + " = " + number * (x + 1));
				}
			}
		}
	}
}
