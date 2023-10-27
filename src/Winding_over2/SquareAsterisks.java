package Winding_over2;

import java.util.Scanner;

public class SquareAsterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n > 0)
            printSquareAsterisks(n);

        else
        {
            System.out.println("Please enter a positive integer.");
        }
    }

    public static void printSquareAsterisks(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                System.out.print("* "); // Print asterisks for the entire square
            }
            System.out.println(); // Move to the next line
        }
    }

}

