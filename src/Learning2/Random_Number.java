package Learning2;

import java.util.Scanner;

public class Random_Number
{
    public static void main(String[] args) {


//        Generate two random single

        int number1 = (int) (Math.random()* 10);
        int number2 = (int) (Math.random()* 10);

//        if number1 < number2 : Swap number 1 with number 2

        if (number1 < number2)
        {
            int temp = number1;

            number1 = number2;
            number2 = number1;

        }
        //            prompt the student to answer " What is number1 - number2?"
        System.out.println(" what is " + number1 +  " - " + number2 + " ? " );

        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();


        if (number1 - number2 == answer)
        {
            System.out.println("You're correct!: ");
        }
        else
        {
            System.out.println(" Your answer is wrong: ");
            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }

    }
}
