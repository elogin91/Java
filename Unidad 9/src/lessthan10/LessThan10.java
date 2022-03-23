package lessthan10;

import java.util.Scanner;

/*Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10,
imprimir en pantalla la leyenda "Todos los números son menores a diez".*/

public class LessThan10 {
	public static void main(String[] args) {
		int numb1, numb2, numb3;
		
		System.out.println("Por favor, ingrese tres números:");
		Scanner inputNumb = new Scanner(System.in);

		numb1=inputNumb.nextInt();
		numb2=inputNumb.nextInt();
		numb3=inputNumb.nextInt();
		
		if(numb1<10 && numb2<10 && numb3<10) {
			System.out.println("Todos los números son menores a diez.");
		}
		else {
			System.out.println("Todos los números NO son menores a diez.");
		}
		
		inputNumb.close();
	}
}
