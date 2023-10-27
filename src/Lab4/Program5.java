package Lab4;
/**
 * Purpose:             Program to enter a line and a character and   <br />
 *                      count how many times the char occurs in the line. <br />
 * Data Submitted:      10/05/2023 <br />
 * Assignment Number:   Lab4, Program5  <br />
 * Course Name:         COSC600  <br />
 * Instructor:          George Ding  <br />
 * File Path:          	Lab4/Program5.java <br />
 * @author        	    Christiantus Chimeziri Anyanwu <br />
 *			            (anyanwu8189) - Student
 * @version            1.0.0
 */
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner myStringInput = new Scanner(System.in);

        String sLine = myStringInput.nextLine();
        System.out.println("Enter a character: ");

        String sChar = myStringInput.nextLine();

        char cChar = sChar.charAt(0);
        int nCount =0;
        for (int i = 0; i < sLine.length(); i++)
        {
            if (sLine.charAt(1) == cChar)
            {
                nCount++;
            }
        }
        System.out.println("Number of occurrences of '" + sChar + "' : " + nCount);
    }

}
