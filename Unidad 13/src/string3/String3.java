package string3;

import java.util.Scanner;

public class String3 {
	public static void main(String[] ar) {
        try (Scanner teclado = new Scanner(System.in)) {
			String apellido1,apellido2;
			System.out.print("Ingrese primer apellido:");
			apellido1=teclado.next();
			System.out.print("Ingrese segundo apellido:");
			apellido2=teclado.next();
			if (apellido1.equals(apellido2)) {
			    System.out.print("Los apellidos son iguales");
			} else {
			    System.out.print("Los apellidos son distintos");
			}
		}
    }
}
