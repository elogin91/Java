package sumaproducto2;

import java.util.Scanner;

public class SumaProducto2 {
    public static void main(String[] ar) {
        Scanner inputKey=new Scanner(System.in);
        int numb1, numb2, numb3, numb4, sum, plus;
        System.out.println("Enter four numbers:");
        numb1=inputKey.nextInt();
        numb2=inputKey.nextInt();
        numb3=inputKey.nextInt();
        numb4=inputKey.nextInt();

        sum= numb1 + numb2;
        plus=numb3 * numb4;
        System.out.print("The sum result is: ");
        System.out.println(sum);
        System.out.print("The plus result is: ");
        System.out.println(plus);
        inputKey.close();
    }

}
