package string;

import java.util.Scanner;

public class Frase {
    private Scanner teclado;
    private String frase;
    
    public Frase() {
        teclado=new Scanner(System.in);
			System.out.print("Escriba una frase: ");
			frase=teclado.nextLine();
    }
    
    public void mostrarPalabras() {
    	System.out.println("-----------------------------------------------------");
    	for(int f=0;f<frase.length();f++) {
    		if(frase.charAt(f)==' '){
    			System.out.println();
    		} else {
    			System.out.print(frase.charAt(f));
    		}
    	}
    }
    
    public static void main(String[] ar) {
    	Frase fr=new Frase();
    	fr.mostrarPalabras();
    } 
}

