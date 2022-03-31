package nalturas;

import java.util.Scanner;

public class nAlturas2 {
	public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un valor:");
        int numValues=scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < numValues ; i++) {
            System.out.print("Ingrese la altura número " + (i+1) + " :");
            sum += scanner.nextInt();
        }

        System.out.print("La suma de las " + sum +" alturas es:");
        System.out.println(sum);
        System.out.print("El promedio es:");
        System.out.print(sum / numValues);
        scanner.close();
	}
}
