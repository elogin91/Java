package condicioncompuesta2;

import java.util.Scanner;

public class CondicionesCompuestas2 {
	public static void main(String[] ar) {
		Scanner teclado = new Scanner(System.in);
		int dia, mes, a�o;
		System.out.print("Ingrese nro de d�a:");
		dia = teclado.nextInt();
		System.out.print("Ingrese nro de mes:");
		mes = teclado.nextInt();
		System.out.print("Ingrese nro de a�o:");
		a�o = teclado.nextInt();
		if (mes == 1 || mes == 2 || mes == 3) {
			System.out.print("La fecha "+dia+"/"+mes+"/"+a�o);
			System.out.print(", corresponde al primer trimestre");
		}
		teclado.close();
	}
}