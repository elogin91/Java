package cifrasNumero;
import java.util.Scanner;



/**Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras. 
Mostrar un mensaje de error si el número de cifras es mayor.*/
public class CifrasNumero {
	
	public static void main(String[] ar) {
		Scanner inputNumb=new Scanner(System.in);
		int numb;
	
		System.out.println("Por favor, introduzca un número positivo entre el 0 y el 1000:");
		numb=inputNumb.nextInt();
	
		if(numb>0 && numb<10) {
			System.out.println("El número introducido" + numb +", es de una cifra.");
		}
		else if(numb>9 && numb<100) {
			System.out.println("El número introducido" + numb +", es de dos cifra.");
		}
		else if(numb>99 && numb<1000) {
			System.out.println("El número introducido" + numb +", es de tres cifra.");
		}
		else {
			System.out.println("El número introducido" + numb +", no cumple los requisitos.");
		}
		
		inputNumb.close();
	}

}
