package estructurafor2;

import java.util.Scanner;

public class estructuraFor2 {
	public static void main(String[] ar) {
		Scanner teclado = new Scanner(System.in);
		int suma, f, valor, promedio;
		suma = 0;
		for (f = 1; f <= 10; f++) {
			System.out.print("Ingrese valor:");
			valor = teclado.nextInt();
			suma = suma + valor;
			teclado.close();
		}
		System.out.print("La suma es:");
		System.out.println(suma);
		promedio = suma / 10;
		System.out.print("El promedio es:");
		System.out.print(promedio);

	}
}
