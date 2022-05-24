package constructor;

import java.util.Scanner;

/*
 * Se desea guardar los sueldos de 5 operarios en un vector. Realizar la creación y carga del vector en el constructor.
 */
public class Constructor1 {
	private Scanner teclado;
    private int[] sueldos;
	
    public Constructor1()
    {
        teclado=new Scanner(System.in);
        sueldos=new int[5];
        for(int f=0;f<5;f++) {
            System.out.print("Ingrese valor de la componente:");
            sueldos[f]=teclado.nextInt();
        }	
    }
	
    public void imprimir() {
        for(int f=0;f<5;f++) {
            System.out.println(sueldos[f]);
        }
    }
	
    public static void main(String[] ar) {
    	Constructor1 op=new Constructor1();
        op.imprimir();
    }
}
