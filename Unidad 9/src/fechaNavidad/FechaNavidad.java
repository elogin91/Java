package fechaNavidad;

import java.util.Scanner;

/*Realizar un programa que pida cargar una fecha cualquiera, luego verificar si dicha fecha corresponde a Navidad*/

public class FechaNavidad {
	public static void main(String[] args) {
		

		int dia, mes;
		Scanner inputNumb = new Scanner(System.in);
			
		System.out.println("Por favor, ingrese el n�mero del d�a:");
		dia=inputNumb.nextInt();
		System.out.println("Por favor, ingrese el n�mero del m�s:");
		mes=inputNumb.nextInt();
		

			
		if(dia==25 && mes==12) {

			System.out.println("Hoy es Navidad.");
		}

		else {
			System.out.println("Hoy no es Navidad.");
		}
		
		inputNumb.close();
	}

}
