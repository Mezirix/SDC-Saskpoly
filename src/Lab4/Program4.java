package Lab4;
/**
 * Purpose:             Program to determine the number of back-to-back   <br />
 *                      repeated character that appears on an input line. <br />
 * Data Submitted:      10/05/2023 <br />
 * Assignment Number:   Lab4, Program4  <br />
 * Course Name:         COSC600  <br />
 * Instructor:          George Ding  <br />
 * File Path:          	Lab4/Program4.java <br />
 * @author        	    Christiantus Chimeziri Anyanwu <br />
 *			            (anyanwu8189) - Student
 * @version            1.0.0
 */

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner myStringInput = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String sString = myStringInput.nextLine();
        int nDupOccurrences = 0;

        for (int i = 0; i < sString.length() - 1; i++)
        {
            if (sString.charAt(i) == sString.charAt(i + 1))
            {
                nDupOccurrences++;
            }
        }
        System.out.println("Number of back-to-back repeated characters: " + nDupOccurrences);
    }
}
