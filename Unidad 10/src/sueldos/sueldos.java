package sueldos;

import java.util.Scanner;

public class sueldos {
	public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int x, n,suma,sueldo, sueldoAlto, sueldoMedio;
        n=0;
        x=1;
        suma=0;
        sueldoAlto=0;
        sueldoMedio=0;
        
        System.out.print("Ingrese el n�mero de empleados:");
        n=teclado.nextInt();
        while (x<=n) {
            System.out.print("Ingrese el sueldo del empleado n�mero " + x +" :");
            sueldo=teclado.nextInt();
            suma=suma+sueldo;
            if(sueldo>300 && sueldo<500) {
            	sueldoAlto++;
            }
            else if(sueldo>100 && sueldo<=300) {
            	sueldoMedio++;
            }
            else {
            	System.out.println("El sueldo del empleado n�mero " + x +" no es v�lido.");
            }
            x++;
        }
        System.out.print("La suma de los " + n +" sueldos es:");
        System.out.println(suma);
        
        System.out.println("Hay " + sueldoAlto + " sueldos entre 300 y 500$");
        System.out.println("Hay " + sueldoMedio + " sueldos entre 100 y 300$");
        teclado.close();
	}
}
