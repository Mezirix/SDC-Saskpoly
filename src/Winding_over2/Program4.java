package Winding_over2;

import java.util.Scanner;

public class Program4
{
    public static void main(String[] args) {

        Scanner myStringInput = new Scanner(System.in);
        System.out.print("Enter the first line of text: ");

        String line1 = myStringInput.nextLine();
        System.out.print(" Enter the second line of text to find: ");

        String line2 = myStringInput.nextLine();

        int index = line1.indexOf(line2);

        if (index != -1)
        {
            System.out.println("The second line is found at index 1 + index " + index + " within the first line: ");

        }
        else
        {
            System.out.println(" The second line is not found, therefore: It's " + "-1");
        }





    }
}
