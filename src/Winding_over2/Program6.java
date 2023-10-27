package Winding_over2;

import java.util.Scanner;

public class Program6
{
    public static void main(String[] args)
    {




        Scanner stringInput = new Scanner(System.in);
        System.out.println("input a line of text: ");

        String line = stringInput.nextLine().trim();

        int Wordseperator = line.indexOf(' ');
        line = line.substring(0, Wordseperator);

        int SecondwordSeperator = line.lastIndexOf(' ');

        String word2 = line.substring(SecondwordSeperator +1);

        System.out.println(" << "  + word2+ " >> " + " is the second last word in the line: " );




    }
}
