package prueba17;

import java.util.Scanner;
public class PruebaVector17 {
    private Scanner teclado;
	private String[] paises;
    private int[] habitantes;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        paises=new String[5];
        habitantes=new int[5];
        System.out.println("Carga de paises y habitantes");
        for(int f=0;f<paises.length;f++) {
            System.out.print("Ingese el nombre del pais:");
            paises[f]=teclado.next();
            System.out.print("Ingrese la cantidad de habitantes:");
            habitantes[f]=teclado.nextInt();
        }
    }        
    
    public void ordenarPorNombres() {
        for(int k=0;k<paises.length;k++) {
            for(int f=0;f<paises.length-1-k;f++) {
                if (paises[f].compareTo(paises[f+1])>0) {
                    String auxpais;
                    auxpais=paises[f];
                    paises[f]=paises[f+1];
                    paises[f+1]=auxpais;
                    int auxhabitante;
                    auxhabitante=habitantes[f];
                    habitantes[f]=habitantes[f+1];
                    habitantes[f+1]=auxhabitante;
                }
            }
        }
    }
        
    public void ordenarPorHabitantes() {
        for(int k=0;k<paises.length;k++) {
            for(int f=0;f<paises.length-1-k;f++) {
                if (habitantes[f]<habitantes[f+1]) {
                    String auxpais;
                    auxpais=paises[f];
                    paises[f]=paises[f+1];
                    paises[f+1]=auxpais;
                    int auxhabitante;
                    auxhabitante=habitantes[f];
                    habitantes[f]=habitantes[f+1];
                    habitantes[f+1]=auxhabitante;
                }
            }
        }
    }
    
    public void imprimir() {
        for(int f=0;f<paises.length;f++) {
            System.out.println(paises[f] + " - " + habitantes[f]);
        }
    }        

    public static void main(String[] ar) {
        PruebaVector17 pv=new PruebaVector17();
        pv.cargar();
        pv.ordenarPorNombres();
 	    System.out.println("Ordenados alfabéticamente");
        pv.imprimir();
        pv.ordenarPorHabitantes();
 	    System.out.println("Ordenados por cantidad de habitnates");        
        pv.imprimir();
    }  	
}
