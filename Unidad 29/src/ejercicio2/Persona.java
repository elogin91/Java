package ejercicio2;

import java.util.Scanner;

public class Persona {
	protected int edad;
	protected String nombre;
	protected Scanner teclado;
	
	 public Persona() {
	        teclado=new Scanner(System.in);
	 }
	 
	 public void cargarDatosPersonales() {
	        System.out.print("Ingrese el nombre:");
	        nombre=teclado.next();
	        System.out.print("Ingrese edad:");
	        edad=teclado.nextInt();
	 }
	 
	 public void imprimirDatosPersonales() {
	        System.out.println("Nombre:"+nombre);
	        System.out.println("Edad:"+edad);
	 }
}
