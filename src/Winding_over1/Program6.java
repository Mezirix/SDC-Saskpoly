package Winding_over1;

import java.util.Scanner;

public class Program6
{
    public static void main(String[] args) {
        int firstNum;
        int secondNum;
        int result;
        Scanner myInput = new Scanner(System.in);
        System.out.print("Input  first number: ");

        firstNum = myInput.nextInt();

        System.out.print("Input second number: ");
        secondNum = myInput.nextInt();
        result = firstNum * secondNum;
        System.out.println(result);
    }
}
