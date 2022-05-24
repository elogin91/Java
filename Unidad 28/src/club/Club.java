package club;

import java.util.Scanner;

public class Club {
	private Socio socio1, socio2, socio3;
	//variable de tipo Scanner
	private Scanner teclado;
	
	public Club() {
		teclado=new Scanner(System.in);
		socio1=new Socio(teclado);
		socio2=new Socio(teclado);
		socio3=new Socio(teclado);		
	}
	public void mayorAntiguedad() {
		if(socio1.retornarAntiguedad()>socio2.retornarAntiguedad()&&socio1.retornarAntiguedad()>socio3.retornarAntiguedad()) {
			System.out.print("El socio con mayor antigüedad es: " ); socio1.imprimirNombre();
		}else {
			if(socio2.retornarAntiguedad()>socio3.retornarAntiguedad()) {
				System.out.print("El socio con mayor antigüedad es: ");  socio2.imprimirNombre();
			}else {
				System.out.print("El socio con mayor antigüedad es: ");  socio3.imprimirNombre();
			}
		}
	}
	public static void main(String[] ar) {
		Club c=new Club();
		c.mayorAntiguedad();
	}

}
