package numeros10;
import java.util.Scanner;

/*Desarrollar un programa que solicite la carga de 10 números e imprima la suma de los últimos 5 valores ingresados.*/
public class Numeros10 {
	static public void main(String[] ar) {
		try (Scanner teclado = new Scanner(System.in)) {
			int numb=0, sum=0;
			System.out.println("Por favor, introduce 10 números.");
			for(int x= 0; x<10; x++) {
				numb=teclado.nextInt();
				if(x>4) {
				sum=sum+numb;
				}
			}
			System.out.println("La suma de los últimos 5 números es: " + sum);
		}
	}
}
