package Lab4;

/**
 * Purpose:             Program to create a multiplication table  <br />
 *                      for numbers 1 to 9. <br />
 * Data Submitted:      10/05/2023 <br />
 * Assignment Number:   Lab4, Program1  <br />
 * Course Name:         COSC600  <br />
 * Instructor:          George Ding  <br />
 * File Path:          	Lab4/Program1.java <br />
 * @author        	    Christiantus Chimeziri Anyanwu <br />
 *			            (anyanwu8189) - Student
 * @version            1.0.0
 */
public class Program1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++)
        {
            for (int j = 1; j <= 9; j++)
            {
                int result = i * j;
                System.out.print(result + "\t");
            }
            System.out.println();
        }
    }

}
