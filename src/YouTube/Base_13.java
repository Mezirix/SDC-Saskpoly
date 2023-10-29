package YouTube;

import java.util.Scanner;

public class Base_13
{
    public static String base13Conversion(String number)
    {
        // Parse the number with source radix
        // and return in specified radix(base)
        return Integer.toString(
                Integer.parseInt(number, 13), 10);
    }
    public static void main(String[] args)
    {
        String number ;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Base 13 number up to 5 digits: ");
        number = input.nextLine();

        System.out.println("The Decimal number is : " + base13Conversion(number));

    }
}

