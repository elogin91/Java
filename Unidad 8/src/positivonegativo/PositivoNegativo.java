package positivonegativo;

import java.util.Scanner;

//Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo.
public class PositivoNegativo {
	public static void main(String[] ar) {
		Scanner inputNumb=new Scanner(System.in);
		int numb;
	
		System.out.println("Por favor, introduzca un número:");
		numb=inputNumb.nextInt();


	
		if(numb>0) {
			System.out.println("El número " + numb + " es positivo.");
		}
		else if(numb<0) {
			System.out.println("El número " + numb + " es negativo.");
		}
		else 
			System.out.println("El número " + numb + " es nulo.");

		inputNumb.close();
	}

}
