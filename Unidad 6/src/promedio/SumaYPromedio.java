package promedio;

import java.util.Scanner;

public class SumaYPromedio {
	public static void main(String[] ar) {
		Scanner inputKey=new Scanner(System.in);
		float numb1, numb2, numb3, numb4, sum, aver;
		System.out.println("Enter four numbers:");
		numb1=inputKey.nextInt();
		numb2=inputKey.nextInt();
		numb3=inputKey.nextInt();
		numb4=inputKey.nextInt();

		sum= numb1 + numb2 + numb3 + numb4;
		aver= sum / 4;
		System.out.print("The sum result is: ");
		System.out.println(sum);
		System.out.print("The average result is: ");
		System.out.println(aver);
		inputKey.close();
	}

}
