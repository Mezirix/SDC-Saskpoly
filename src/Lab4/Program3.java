package Lab4;

/**
 * Purpose:             Program to compute the greatest   <br />
 *                      common divisor of two numbers. <br />
 * Data Submitted:      10/05/2023 <br />
 * Assignment Number:   Lab4, Program3  <br />
 * Course Name:         COSC 600  <br />
 * Instructor:          George Ding  <br />
 * File Path:          	Lab4/Program3.java <br />
 * @author        	    Christiantus Chimeziri Anyanwu <br />
 *			            (anyanwu8189) - Student
 * @version            1.0.0
 */

//import java.util.Scanner;
//
//public class Program3 {
//    public static void main(String[] args) {
//        Scanner myNumInput = new Scanner(System.in);
//        System.out.println("Enter two numbers: ");
//        int n1 = myNumInput.nextInt();
//        int n2 = myNumInput.nextInt();
//        int gcd = 1;
//        int k = 2;
//        while (k <= n1 && k <= n2)
//        {
//            if (n1 % k == 0 && n2 % k == 0)
//            {
//                gcd = k;
//            }
//            k++;
//        }
//        System.out.println(" GCD: " + gcd);
//    }
//}

public class Program3 {
    public static void main(String[] args) {
        int[][] testArray = {
                {3, 19, 22, 14, 7, 8, 9},
                {3, 1, 12, 4, 3, 8, 2},
                {13, 9, 2, 8, 7, 14, 9},
                {8, 27, 7, 11, 7, 5, 20}
        };

        int[] rowSums = sumArrayRows(testArray);

        // Display the sums of each row
        System.out.println("Sums of each row:");
        for (int sum : rowSums) {
            System.out.print(sum + " ");
        }
    }

    // Add the sumArrayRows method here
    public static int[] sumArrayRows(int[][] aTest) {
        int m = aTest.length;
        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            int sum = 0;

            // Calculate the sum of each row
            for (int j = 0; j < aTest[i].length; j++) {
                sum += aTest[i][j];
            }
            result[i] = sum;
        }

        return result;
    }
}

