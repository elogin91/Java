package condicionalcompuesta1;

import java.util.Scanner;

public class CondicionalCompuesta1 {
	 public static void main(String[] ar) {
	    	Scanner teclado=new Scanner(System.in);
	    	int num1,num2;
	    	System.out.print("Ingrese primer valor:");
	    	num1=teclado.nextInt();
	    	System.out.print("Ingrese segundo valor:");
	    	num2=teclado.nextInt();
	    	System.out.print("El n�mero mayor es ");
	    	if (num1>num2) {
	    		System.out.print(num1);
	    	} else {
	    		System.out.print(num2);
	    	}
	    }
}
