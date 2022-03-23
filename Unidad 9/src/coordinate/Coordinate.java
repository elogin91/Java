package coordinate;

import java.util.Scanner;

public class Coordinate {
	public static void main(String[] args) {
		int x, y;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribir un programa que pida ingresar la coordenada de un punto en el plano, es decir dos valores enteros x e y (distintos a cero).\r\n"
				+ "Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto. (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)");
		System.out.println("Por favor, introduzca la coordenada x:");
		x = teclado.nextInt();
		System.out.println("Por favor, introduzca la coordenada y:");
		y = teclado.nextInt();
		
		if (x==0 || y==0) {
			System.out.println("Las coordenadas introducidas no son validas");
		}
		else {
			if(x>0 && y>0) {
				System.out.println("Las cordenadas "+x+", "+y+" se situan en el primer cuadrante.");
			}
			else if(x<0 && y>0) {
				System.out.println("Las cordenadas "+x+", "+y+" se situan en el segundo cuadrante.");
			}
			else if(x<0 && y<0) {
				System.out.println("Las cordenadas "+x+", "+y+" se situan en el tercer cuadrante.");
			}
			else {
				System.out.println("Las cordenadas "+x+", "+y+" se situan en el cuarto cuadrante.");
			}
		}
		teclado.close();
	}
}
