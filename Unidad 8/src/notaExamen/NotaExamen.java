package notaExamen;

import java.util.Scanner;

//Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: 
//cantidad total de preguntas que se le realizaron y la cantidad de preguntas que contestó correctamente. 
//Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo según 
//el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
//Nivel máximo:	Porcentaje>=90%.
//Nivel medio:	Porcentaje>=75% y <90%.
//Nivel regular:	Porcentaje>=50% y <75%.
//Fuera de nivel:	Porcentaje<50%.
public class NotaExamen {
	
	public static void main(String[] ar) {
		Scanner inputNumb=new Scanner(System.in);
		int totalAsk, answerAsk, calification;
	
		System.out.println("Por favor, introduzca el número total de preguntas:");
		totalAsk=inputNumb.nextInt();
		System.out.println("Por favor, introduzca el número de preguntas contestadas:");
		answerAsk=inputNumb.nextInt();
		
		calification = answerAsk * 100 / totalAsk; 

	
		if(calification<50) {
			System.out.println("Ha obtenido la calificación de " + calification + "%, por lo tanto está fuera de nivel.");
		}
		else if(calification>=50 && calification<75) {
			System.out.println("Ha obtenido la calificación de " + calification + "%, por lo tanto tiene un nivel regular.");
		}
		else if(calification>=75 && calification<90) {
			System.out.println("Ha obtenido la calificación de " + calification + "%, por lo tanto tiene un nivel medio.");
		}
		else 
			System.out.println("Ha obtenido la calificación de " + calification + "%, por lo tanto tiene el nivel máximo.");

		inputNumb.close();
	}
}
