package mayorIntDeTres;

import java.util.Scanner;

//Se cargan por teclado tres n�meros distintos. Mostrar por pantalla el mayor de ellos.
public class MayotIndDeTres {
	public static void main(String[] ar) {
		Scanner inputNumb=new Scanner(System.in);
		int numb1, numb2, numb3;
	
		System.out.println("Por favor, introduzca tres n�meros:");
		numb1=inputNumb.nextInt();
		numb2=inputNumb.nextInt();
		numb3=inputNumb.nextInt();
	
		if(numb1>numb2 && numb1>numb3) {
			System.out.println("El primer n�mero introducido el n�mero " + numb1 +", es el n�mero mayor.");
		}
		else if(numb2>numb3 && numb2>numb1) {
			System.out.println("El segundo n�mero introducido el n�mero " + numb2 +", es el n�mero mayor.");
		}
		else 
			System.out.println("El tercer n�mero introducido el n�mero " + numb3 +", es el n�mero mayor.");

		inputNumb.close();
	}

}
