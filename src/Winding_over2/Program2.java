package Winding_over2;

import java.util.Scanner;

public class Program2
{
    public static void main(String[] args) {


        Scanner myInput = new Scanner(System.in);
        System.out.print(" Input a number: ");

        int firstNum = myInput.nextInt();
        System.out.print(" Input an exponent: ");

        int exp = myInput.nextInt();

        double resultExp = Math.pow(firstNum, exp);
        double resultLog = Math.log(firstNum);
        double resultRoot = Math.sqrt(firstNum);


        System.out.println(firstNum + "  Raised to the "  + exp + " power is " + resultExp);
        System.out.println(" The log of " + firstNum + " is " + resultLog);
        System.out.println(" The square root of " + firstNum + " is " + resultRoot);


    }
}
