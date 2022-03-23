package squareperimeter;

import java.util.Scanner;

public class SquarePerimeter {
	public static void main(String[] ar) {
		Scanner inputKey=new Scanner(System.in);

	    int numb1;
	    int perimeter;

	    System.out.println("Please enter a number:");
	    numb1=inputKey.nextInt(); //Coge el siguiente entero
	    perimeter = numb1 * 4;

	    System.out.print("The square perimeter is ");
	    System.out.println(perimeter);
	    inputKey.close();
	    }
	}