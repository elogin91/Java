package string;

import java.util.Scanner;

public class Mail {
	private Scanner teclado;
	private String mail;
	public Mail() {
		teclado=new Scanner(System.in);
		System.out.print("Ingrese dirección de mail:");
		mail=teclado.next();
	}
	
	public void contieneArroba() {
		for (int f=0;f<mail.length();f++) {
			char carac1=mail.charAt(f);
			if (carac1=='@') {
				System.out.println(mail+": tiene caracter @");
				return;
			}			
		}
		System.out.println(mail+": no tiene caracter @");
	}
	public static void main(String[] ar) {
		Mail ma=new Mail();
		ma.contieneArroba();
		
	}
}