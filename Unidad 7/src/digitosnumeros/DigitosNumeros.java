package digitosnumeros;

import java.util.Scanner;

public class DigitosNumeros {
	public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	int num1;
    	
    	System.out.println("Ingreseun n�mero comprendido entre 1 y 99:");
    	num1=teclado.nextInt();

    	if (num1>10 && num1<100) {
    		System.out.print("El n�mero tiene dos cifras.");
    	} 
    	else if (num1<10 && num1>0) {
    		System.out.print("El n�mero tiene una cifras.");
    	} 
    	else {
    		System.out.print("El n�mero introducido no es v�lido.");
    	}
    	teclado.close();
    }
}
