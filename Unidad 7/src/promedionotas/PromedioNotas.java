package promedionotas;

import java.util.Scanner;

public class PromedioNotas {
	 public static void main(String[] ar) {
	    	Scanner teclado=new Scanner(System.in);
	    	int num1,num2,num3;
	    	
	    	System.out.println("Ingrese tres valores:");
	    	num1=teclado.nextInt();
	    	num2=teclado.nextInt();
	    	num3=teclado.nextInt();
	    	
	    	if ((num1+num2+num3)/3 >=7) {
	    		System.out.print("EL alumno ha PROMOCIONADO.");

	    	} else {
	    		System.out.print("EL alumno NO ha PROMOCIONADO.");
	    	}
	    	teclado.close();
	    }
}
