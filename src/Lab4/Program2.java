package Lab4;

/**
 * Purpose:             Program to convert an inputted number   <br />
 *                      from decimal to hex. <br />
 * Data Submitted:      10/05/2023 <br />
 * Assignment Number:   Lab4, Program2  <br />
 * Course Name:         COSC600  <br />
 * Instructor:          George Ding  <br />
 * File Path:          	Lab4/Program2.java <br />
 * @author        	    Christiantus Chimeziri Anyanwu <br />
 *			            (anyanwu8189) - Student
 * @version            1.0.0
 **/

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner myDecInput = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = myDecInput.nextInt();
        String hex = "";
        while (decimal != 0)
        {
            int hexValue = decimal % 16;
            char hexDigit = (hexValue >= 0 && hexValue <= 9) ? (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');
            hex = hexDigit + hex;
            decimal /= 16;
        }
        System.out.println("Hexadecimal equivalent: " + hex);
    }
}
