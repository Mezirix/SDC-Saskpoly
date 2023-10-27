package Winding_over2;

import java.util.Scanner;

public class Program5
{
    public static void main(String[] args) {

        Scanner myLineInput = new Scanner(System.in);
        System.out.println(" Enter a line of text: ");

//        String firstWord = myLineInput.nextLine();
        String text = myLineInput.nextLine();
        text = text.trim();

        int index = text.indexOf(" ");

        if (index != -1)
        {
            String firstWord = text.substring(0, index);
            String remainder = text.substring(index -1);

            remainder = remainder.trim();
            System.out.println(remainder + " " + firstWord);
        }
        else
        {
            System.out.println(text);
        }

    }
}
