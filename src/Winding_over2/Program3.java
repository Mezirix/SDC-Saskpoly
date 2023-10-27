package Winding_over2;

import java.util.Scanner;

public class Program3
{
    public static void main(String[] args) {

        Scanner myDoubleInput = new Scanner(System.in);
        System.out.print("Enter double four  numbers: ");

        double val1 = myDoubleInput.nextDouble();
        double val2 = myDoubleInput.nextDouble();
        double val3 = myDoubleInput.nextDouble();
        double val4 = myDoubleInput.nextDouble();


        double val1ceil = Math.ceil(val1);
        double val1floor = Math.floor(val1);

        double minVal = Math.min(val2,val3);
        double maxVal = Math.max(val2, val3);
        double absVal = Math.abs(val4);

        System.out.println(val1 + " rounded up is " + Math.ceil(val1)) ;
        System.out.println(val1 + " Rounded down is " + Math.floor(val1));
        System.out.println(val2 + " The min value of " + val2 + " and "  + val3 + " = " + Math.min(val2,val3));
        System.out.println(val2 + " The max value of "  + val2 + " and " + val3 + " = " + Math.max(val2, val3) );
        System.out.println(val4 + " The absolute value of" + val4 + " is " + val4 +  Math.abs(val4));
    }
}
