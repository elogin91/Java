package ejercicio3;

import java.util.Scanner;

public class SueldoEmpleados {
	private Scanner teclado= new Scanner(System.in);;
	private int[][] sueldoMensual= new int[4][3];
	private int[] sueldoTotal= new int [4];
	private String[] nombre= new String[4];
	
	
	private void cargar() {

        for(int f = 0; f < nombre.length; f++)
        {
            System.out.println("Ingrese el nombre del empleado:");
            nombre[f]=teclado.next();
            for(int c = 0; c < sueldoMensual[f].length; c++) 
            {
                System.out.println("Ingrese el sueldo del mes " + (c+1) + "º de "  + nombre[f] + ":");
                sueldoMensual[f][c]=teclado.nextInt();
            }
        }
    }
	
	private void totalSueldos() {
		for(int f = 0; f < nombre.length; f++)
        {
            for(int c = 0; c < sueldoMensual[f].length; c++) 
            {
                sueldoTotal[f]=sueldoTotal[f]+sueldoMensual[f][c];
            }
        }
	}
	
	private void imprimirTotalSueldos() {
		for(int f = 0; f < nombre.length; f++)
        {
			System.out.println("El sueldo total de " + nombre[f] + " es: " + sueldoTotal[f] + ".");
        }
	}
	
	private void empleadoMayorSueldo() {
		int max = 0;
		for(int i = 1 ; i < sueldoTotal.length; i ++) {
			if(sueldoTotal[max] < sueldoTotal[i]) {
				max = i;
			}
		}
		System.out.println("El sueldo máximo de " + sueldoTotal[max]+ " es de "+ nombre[max]);		
	}
	
	public static void main(String[] args) {
        SueldoEmpleados plantilla = new SueldoEmpleados();
        plantilla.cargar();
        plantilla.totalSueldos();
        plantilla.imprimirTotalSueldos();
        plantilla.empleadoMayorSueldo();
    }
}
