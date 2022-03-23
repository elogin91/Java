package workerinfo;

import java.util.Scanner;

public class WorkerInfo {
	public static void main(String[] args) {
		System.out.println("De un operario se conoce su sueldo y los años de antigüedad. Se pide confeccionar un programa que lea los datos de entrada e informe:\r\n"
				+ "a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, otorgarle un aumento del 20 %, mostrar el sueldo a pagar.\r\n"
				+ "b)Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5 %.\r\n"
				+ "c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.");

		int sueldo, antiguedad;
		Scanner inputNumb = new Scanner(System.in);
			
		System.out.println("Por favor, ingrese el sueldo del operario:");
		sueldo=inputNumb.nextInt();
		
		System.out.println("Por favor, ingrese los años de antiguedad del operario:");
		antiguedad=inputNumb.nextInt();

			
		if(sueldo<500 && antiguedad>=10) {

			System.out.println("Su sueldo con un aumento del 20% es: " + sueldo*1.20);
		}
		else if(sueldo<500 && antiguedad<10) {

			System.out.println("Su sueldo con un aumento del 5% es: " + sueldo*1.05);
		}
		else {
			System.out.println("Sin cambios en el sueldo.");
		}
		
		inputNumb.close();
	}
}
