package condicional1;

import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	float sueldo;
    	System.out.print("Ingrese el sueldo:");
    	sueldo=teclado.nextFloat();
    	if (sueldo>3000) {
    	    System.out.println("Esta persona debe abonar impuestos");
    	}
    	else
    	{
    		 System.out.println("Esta persona NO debe abonar impuestos");
    	}
    	teclado.close();
    }
}
