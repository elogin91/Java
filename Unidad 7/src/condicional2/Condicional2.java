package condicional2;
import java.util.Scanner;

public class Condicional2 {
	
		 public static void main(String[] ar) {
		    	Scanner teclado=new Scanner(System.in);
		    	float num1,num2;
		    	
		    	System.out.println("Ingrese dos valores:");
		    	num1=teclado.nextFloat();
		    	num2=teclado.nextFloat();
		    	
		    	if (num1>num2) {
		    		System.out.print("La suma de los dos n�meros introducidos es: ");
		    		System.out.println(num1+num2);
		    		System.out.print("La resta de los dos n�meros introducidos es: ");
		    		System.out.println(num1-num2);
		    	} else {
		    		System.out.print("La multiplicaci�n de los dos n�meros introducidos es: ");
		    		System.out.println(num1*num2);
		    		System.out.print("La divisi�n de los dos n�meros introducidos es: ");
		    		System.out.println(num1/num2);
		    	}
		    }
}
