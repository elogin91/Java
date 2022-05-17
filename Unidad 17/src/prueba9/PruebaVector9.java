package prueba9;

import java.util.Scanner;
public class PruebaVector9 {
    private Scanner teclado;
    private int[] vec;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantos elementos tiene el vector:");
        int n;
        n=teclado.nextInt();
        vec=new int[n];        
        for(int f=0;f<vec.length;f++) {
            System.out.print("Ingrese elemento:");
            vec[f]=teclado.nextInt();
        }
    }
    
    public void acumularElementos() {
        int suma=0;
        for(int f=0;f<vec.length;f++) {
            suma=suma+vec[f];
        }
        System.out.println("La suma de los elementos es:"+suma);
    }
    
    public static void main(String[] ar) {
        PruebaVector9 pv=new PruebaVector9();
        pv.cargar();
        pv.acumularElementos();
    }
}
