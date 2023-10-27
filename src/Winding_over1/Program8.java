package Winding_over1;

import java.util.Scanner;

public class Program8
{
    public static void main(String[] args)
    {
        int firstNum, secondNum, result;

        Scanner myCalcInput = new Scanner(System.in);


        System.out.print("Input first number: ");
        firstNum = myCalcInput.nextInt();

        System.out.print("input second number: ");
        secondNum = myCalcInput.nextInt();

        result = firstNum + secondNum;
        System.out.println( firstNum + " + " + secondNum + " = " +result );


        result = firstNum - secondNum;
        System.out.println(firstNum + " - " + secondNum + " = " + result);

        result = firstNum * secondNum;
        System.out.println(firstNum + " * " + secondNum + " = " + result);

        result = firstNum / secondNum;
        System.out.println(firstNum + " / " + secondNum + " = " + result);

        result = firstNum   % secondNum;
        System.out.print(firstNum + " % " +  secondNum + " = " + result);
//        System.out.println(+ firstNum + secondNum + " = " + result);
//


    }
}
