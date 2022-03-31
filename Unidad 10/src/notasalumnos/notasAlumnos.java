package notasalumnos;
import java.util.Scanner;


/**
 * 	@author xesa
 *	Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas 
 *	mayores o iguales a 7 y cuántos menores.
 */
public class notasAlumnos {
	public static void main (String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int x=0;
		int notasAltas=0;
		int notasBajas=0;
		
		System.out.println("Por favor, introduzca la nota de 10 alumnos.");
		
		while(x < 10) {
			if(inputData(teclado.nextInt()) >= 7) {
				notasAltas++;
			}
			else {
				notasBajas++;
			}
			x++;
		}
		
		System.out.println("Hay " + notasAltas + " notas iguales o superiores a 7 y " + notasBajas + " notas inferiores a 7.");
		
		teclado.close();
	}
	
	public static int inputData(int data) {
		return data;
	}
	
}
