package sumplusint;

import java.util.Scanner;

/*Se ingresan tres valores por teclado, si todos son iguales se imprime la suma del 
primero con el segundo y a este resultado se lo multiplica por el tercero.*/

public class SumPlusInt {
	public static void main(String[] args) {
		int numb1, numb2, numb3, total;
		
		System.out.println("Por favor, ingrese tres números:");
		Scanner inputNumb = new Scanner(System.in);

		numb1=inputNumb.nextInt();
		numb2=inputNumb.nextInt();
		numb3=inputNumb.nextInt();
		
		if(numb1==numb2 && numb2==numb3) {
			total=(numb1+numb2)*numb3;
			System.out.println("El resultado de la operacion es: " + total +".");
		}
		
		inputNumb.close();
	}

}
