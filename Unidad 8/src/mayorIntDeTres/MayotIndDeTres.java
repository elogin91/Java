package mayorIntDeTres;

import java.util.Scanner;

//Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.
public class MayotIndDeTres {
	public static void main(String[] ar) {
		Scanner inputNumb=new Scanner(System.in);
		int numb1, numb2, numb3;
	
		System.out.println("Por favor, introduzca tres números:");
		numb1=inputNumb.nextInt();
		numb2=inputNumb.nextInt();
		numb3=inputNumb.nextInt();
	
		if(numb1>numb2 && numb1>numb3) {
			System.out.println("El primer número introducido el número " + numb1 +", es el número mayor.");
		}
		else if(numb2>numb3 && numb2>numb1) {
			System.out.println("El segundo número introducido el número " + numb2 +", es el número mayor.");
		}
		else 
			System.out.println("El tercer número introducido el número " + numb3 +", es el número mayor.");

		inputNumb.close();
	}

}
