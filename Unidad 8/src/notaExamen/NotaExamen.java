package notaExamen;

import java.util.Scanner;

//Un postulante a un empleo, realiza un test de capacitaci�n, se obtuvo la siguiente informaci�n: 
//cantidad total de preguntas que se le realizaron y la cantidad de preguntas que contest� correctamente. 
//Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo seg�n 
//el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
//Nivel m�ximo:	Porcentaje>=90%.
//Nivel medio:	Porcentaje>=75% y <90%.
//Nivel regular:	Porcentaje>=50% y <75%.
//Fuera de nivel:	Porcentaje<50%.
public class NotaExamen {
	
	public static void main(String[] ar) {
		Scanner inputNumb=new Scanner(System.in);
		int totalAsk, answerAsk, calification;
	
		System.out.println("Por favor, introduzca el n�mero total de preguntas:");
		totalAsk=inputNumb.nextInt();
		System.out.println("Por favor, introduzca el n�mero de preguntas contestadas:");
		answerAsk=inputNumb.nextInt();
		
		calification = answerAsk * 100 / totalAsk; 

	
		if(calification<50) {
			System.out.println("Ha obtenido la calificaci�n de " + calification + "%, por lo tanto est� fuera de nivel.");
		}
		else if(calification>=50 && calification<75) {
			System.out.println("Ha obtenido la calificaci�n de " + calification + "%, por lo tanto tiene un nivel regular.");
		}
		else if(calification>=75 && calification<90) {
			System.out.println("Ha obtenido la calificaci�n de " + calification + "%, por lo tanto tiene un nivel medio.");
		}
		else 
			System.out.println("Ha obtenido la calificaci�n de " + calification + "%, por lo tanto tiene el nivel m�ximo.");

		inputNumb.close();
	}
}
