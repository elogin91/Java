package prueba8;

import java.util.Scanner;
public class PruebaVector8 {
    private Scanner teclado;
    private int[] sueldos;
	
    public void cargar()
    {
        teclado=new Scanner(System.in);
        System.out.print("Cuantos sueldos cargar�:");
        int cant;
        cant=teclado.nextInt();
        sueldos=new int[cant];
        for(int f=0;f<sueldos.length;f++) {
            System.out.print("Ingrese sueldo:");
            sueldos[f]=teclado.nextInt();
        }	
    }
	
    public void imprimir() {
        for(int f=0;f<sueldos.length;f++) {
            System.out.println(sueldos[f]);
        }
    }
	
    public static void main(String[] ar) {
        PruebaVector8 pv=new PruebaVector8();
        pv.cargar();
        pv.imprimir();
    }
}
