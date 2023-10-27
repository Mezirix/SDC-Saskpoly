package Learning;

import java.util.Scanner;

public class Switch_day
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day: ");

        int day = input.nextInt();

        switch (day % 7)
        {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");






        }



    }
}
