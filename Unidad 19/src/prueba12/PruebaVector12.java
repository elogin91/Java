package prueba12;

import java.util.Scanner;
public class PruebaVector12 {
    private Scanner teclado;
    private int []vec;
    private int menor;

    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantos elementos desea cargar:");
        int n=teclado.nextInt();
        vec=new int[n];
        for(int f=0;f<vec.length;f++) {
            System.out.print("Ingrese componente:");
            vec[f]=teclado.nextInt();
        }
    }
    
    public void menorElemento() {
        menor=vec[0];
        for(int f=1;f<vec.length;f++) {
            if (vec[f]<menor) {
                menor=vec[f];
            }
        }
        System.out.println("El elemento menor es:"+menor);        
    }
    
    public void repiteMenor() {
        int cant=0;
        for(int f=0;f<vec.length;f++) {
            if (vec[f]==menor) {
                cant++;
            }
        }
        if (cant>1) {
            System.out.println("Se repite el menor en el vector.");    
        } else {
            System.out.println("No se repite el menor en el vector.");
        }
    }
    
    public static void main(String[] ar) {
        PruebaVector12 pv=new PruebaVector12();
        pv.cargar();
        pv.menorElemento();
        pv.repiteMenor();
    }
}