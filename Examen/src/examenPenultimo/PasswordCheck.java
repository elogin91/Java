package examenPenultimo;

import java.util.Scanner;

public class PasswordCheck {
	String password;
	
	public void cargar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el password a comprobar: ");
		password = teclado.nextLine();
		teclado.close();
	}
	
	public void checking () {
		
		if ("Palangana2".equals(password)) {
			System.out.println("La Password es Correcta");
		} 
		else {
			System.out.println("La Password NO es Correcta");

		}
	}
	
	public static void main(String[] ar) {
		 PasswordCheck check1 = new  PasswordCheck();
		 check1.cargar();
		 check1.checking();
	}

}
