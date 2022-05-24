package string;

import java.util.Scanner;
public class Ejercicio4 {
	private Scanner teclado;
	private String [] nombres;
	private String [] mail;
	public Ejercicio4() {
		teclado= new Scanner(System.in);
		nombres=new String[5];
		mail=new String[5];
		System.out.println("INTRODUCCIÓN DE NOMBRES Y MAIL´S");
		for(int f=0;f<nombres.length; f++) {
			System.out.print("Introduzca el nombre "+(f+1)+ " :");
			nombres[f]=teclado.next();
			System.out.print("Introduzca el mail "+(f+1)+ " :");
			mail[f]=teclado.next();
		}
		System.out.println();
	}
	public void imprimir() {
		for(int f=0; f<nombres.length; f++) {
			System.out.println(nombres[f]+ ". Su correo es: "+mail[f]);
		}		
	}
	public void consultaMail() {
		String nomaux;
		boolean x=false;
		System.out.print("Introduzca el nombre:");
		nomaux=teclado.next();
		for(int f=0; f<nombres.length; f++) {
			if(nomaux.equals(nombres[f]) ) {
				System.out.println("El correo del nombre "+nombres[f]+ " es "+ mail[f]);
				x=true;
			}
		}	
		if(x==false) {				
			System.out.print("No encontrado");
		}
		System.out.println();
	}
	public void sinArroba(){
		for(int f=0; f<mail.length; f++) {
			boolean x=false;
			for(int c=0; c<mail[f].length(); c++) {
				if(mail[f].charAt(c)=='@') {
					x=true;
				}
			}
			if(x==false) {
				System.out.println("El correo "+ mail[f]+ " no tiene @");
			}
		}
	}
	public static void main (String[] ar) {
		Ejercicio4 ej4=new Ejercicio4();
		ej4.imprimir();
		ej4.consultaMail();
		ej4.sinArroba();
	}
}

