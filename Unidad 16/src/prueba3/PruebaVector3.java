package prueba3;

import java.util.Scanner;
public class PruebaVector3 {
    private Scanner teclado;
    private float[] turnoMan;
    private float[] turnoTar;
	
    public void cargar() {
        teclado=new Scanner(System.in);
        turnoMan=new float[4];
        turnoTar=new float[4];
        System.out.println("Sueldos de empleados del turno de la ma�ana.");
        for(int f=0;f<4;f++) {
            System.out.print("Ingrese sueldo:");
            turnoMan[f]=teclado.nextFloat();
        }
        System.out.println("Sueldos de empleados del turno de la tarde.");
        for(int f=0;f<4;f++) {
            System.out.print("Ingrese sueldo:");
            turnoTar[f]=teclado.nextFloat();
        }
    }
	
    public void calcularGastos() {
        float man=0;
        float tar=0;
        for(int f=0;f<4;f++){
            man=man+turnoMan[f];
            tar=tar+turnoTar[f];
        }
        System.out.println("Total de gastos del turno de la ma�ana:"+man);
        System.out.println("Total de gastos del turno de la tarde:"+tar);
    }
	
    public static void main(String[] ar){
        PruebaVector3 pv=new PruebaVector3();
        pv.cargar();
        pv.calcularGastos();
    }
}