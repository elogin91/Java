package nalturas;

import java.util.Scanner;

public class nAlturas {
	public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int x, n,suma,promedio;
        n=0;
        x=1;
        suma=0;
        System.out.print("Ingrese un valor:");
        n=teclado.nextInt();
        while (x<=n) {
            System.out.print("Ingrese la altura número " + x +" :");
            suma=suma+teclado.nextInt();
            x++;
        }
        promedio=suma/n;
        System.out.print("La suma de las " + n +" alturas es:");
        System.out.println(suma);
        System.out.print("El promedio es:");
        System.out.print(promedio);
        teclado.close();
	}
}
