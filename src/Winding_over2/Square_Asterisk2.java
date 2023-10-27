package Winding_over2;

import java.util.Scanner;

public class Square_Asterisk2
{




        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a positive integer: ");
            int n = input.nextInt();

            if (n > 0)
            {
                printSquare_Asterisks(n);
            } else
            {
                System.out.println("Please enter a positive integer.");
            }
        }

        public static void printSquare_Asterisks(int n)
        {
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= n; j++)
                {
                    if (i == 1 || i == n || j == 1 || j == n || i == j || j == n - i + 1)
                    {
                        System.out.print("* "); // Print asterisks for the square and diagonal
                    } else
                    {
                        System.out.print("  "); // Print spaces for the interior
                    }
                }
                System.out.println(); // Move to the next line
            }
        }


    }
