package anylessthan10;

import java.util.Scanner;

public class AnyLessThan10 {
	public static void main(String[] args) {
		System.out.println(
				"Se ingresan por teclado tres números, si al menos uno de los valores ingresados es menor a 10, imprimir en pantalla la leyenda \"Alguno de los números es menor a diez\".");
		System.out.println("Por favor, ingrese tres números:");
		Scanner inputNumb = new Scanner(System.in);

		for (int x = 0; x < 3; x++) {
			if (lessThan10(inputNumb.nextInt())) {
				print();
				break;
			}
		}
		inputNumb.close();
	}

	public static boolean lessThan10(int numb) {
		return (numb < 10);
	}

	public static void print() {
			System.out.println("Alguno de los números es menor a diez");

	}
}
