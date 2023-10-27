package Learning2;

import java.util.Scanner;

public class If_statement2
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a Score value: ");


        double score = input.nextDouble();
        if (score >= 60)
        {
            System.out.println(" D ");
        }
        if (score >= 70)
        {
            System.out.println(" C ");
        }
        if ( score >= 80)
        {
            System.out.println(" B ");
        }
         if (score >= 90)
        {
            System.out.println(" A ");

        }
        else
        {
            System.out.println(" F ");
        }
//        System.out.print("Enter an integer: ");
//        int number = input.nextInt();
//
//        if (number % 5 == 0)
//        {
//            System.out.println(" Hifive ");
//        }
//        if (number % 2 == 0)
//        {
//            System.out.println(" HiEven");
//        }
    }
}
