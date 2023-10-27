package Winding_over1;

import java.util.Scanner;

public class Program7
{
    public static void main(String[] args) {
        float inputNum;
        float result;
        Scanner numInput = new Scanner(System.in);
        System.out.print("Input number: ");

        inputNum = numInput.nextFloat();
        result = inputNum * 10;
        System.out.println( "product: " + inputNum + " * 10 = " + result);
    }
}
