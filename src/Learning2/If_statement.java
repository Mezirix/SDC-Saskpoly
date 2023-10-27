package Learning2;

import java.util.Scanner;

public class If_statement
{
    public static void main(String[] args)
    {

//        int y = 1;
//
//        if (y > 0)
//        {
//            System.out.print(" x " + " = " + 1  );
//
//        }

        Scanner input = new Scanner(System.in);
        System.out.print(" Input a number ");
        int score;

        score = input.nextInt();

        if (score > 90 )
        {
            System.out.println(" increase tax by 3%");
        }
        else
        {
            System.out.println(" Invalid ");
        }


//        if (x >= 3)
    }

}
