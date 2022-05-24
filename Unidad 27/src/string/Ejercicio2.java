package string;

import java.util.Scanner;

public class Ejercicio2 {
	private static String email;

	public Ejercicio2() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese una palabra:");
		email = teclado.nextLine();
	}

	public void mitad() {
		System.out.print("la primera mitad de la palabra es: ");
		for (int f = 0; f < (email.length() / 2); f++) {
			System.out.print(email.charAt(f));
		}
		System.out.println(" ");
	}

	public void ulti() {
		System.out.print("la ultima letra de la palabra es: ");
		System.out.print(email.charAt(email.length() - 1));
		System.out.println(" ");
	}

	public void inv() {
		System.out.print("la palabra escrita inversa es: ");
		for (int f = (email.length() - 1); f > -1; f--) {
			System.out.print(email.charAt(f));
		}
		System.out.println(" ");
	}

	public void guion() {
		System.out.print("los caracteres son: ");
		System.out.print(email.charAt(0));
		for (int f = 1; f < (email.length()); f++) {
			System.out.print("-");
			System.out.print(email.charAt(f));

		}
		System.out.println(" ");
	}

	public void vocal() {
		int nVocal = 0;
		System.out.print("el numero de vocales es de : ");
		for (int f = 0; f < (email.length()); f++) {
			if (email.charAt(f) == 'a' || email.charAt(f) == 'e' || email.charAt(f) == 'i' || email.charAt(f) == 'o'
					|| email.charAt(f) == 'u') {
				nVocal = nVocal + 1;
			}
		}
		System.out.print(nVocal);
		System.out.println(" ");
	}

	public void palindro() {
		boolean pla = true;
		for (int f = 0; f < (email.length()); f++) {
			if (email.charAt(f) != email.charAt(email.length() - 1 - f)) {
				pla = false;
			}
		}
		if (pla == true) {
			System.out.print("La palabra es un Palíndromo");
		} else {
			System.out.print("La palabra es NO un Palíndromo");
		}
		System.out.println(" ");
	}

	public static void main(String[] ar) {
		Ejercicio2 es = new Ejercicio2();
		es.mitad();
		es.ulti();
		es.inv();
		es.guion();
		es.vocal();
		es.palindro();
	}
}