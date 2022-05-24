package string;

import java.util.Scanner;
public class Cadena3Clave {
	Scanner teclado = new Scanner(System.in);
	String cadena = " ";
	String clave = "123abc";
	public void cargar() {
		System.out.println("----------------------------------------------------------");
		System.out.println("Cargar un a clave y comprobar si es correcta ");
		System.out.println("----------------------------------------------------------");
		System.out.print("Ingrese una Clave: ");
		cadena = teclado.nextLine();
		teclado.close();
	}
	public void comparar() {
		int comp = cadena.compareTo(clave);
		if (comp == 0) {
			System.out.println("La Clave es Correcta");
		} else {
			System.out.println("La Clave no es correcta");
		}
	}
	public static void main(String[] ar) {
		Cadena3Clave c3 = new Cadena3Clave();
		c3.cargar();
		c3.comparar();
	}
}

