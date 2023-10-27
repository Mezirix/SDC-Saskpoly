package Learning;
//Suppose m and r are integers. Write a Java expression for mr^2 to obtain a floating-point result.
public class MathExpression2 {
    public static void main(String[] args) {
/* To obtain a floating-point result <br />
    for the expression 'm * r^2' where <br />
    'm' and 'r' are integers, you can <br />
    explicitly cast one of the integers <br />
    to a floating-point type(e.g. 'double') <br />
    before performing the calculation. <br />
    Here's how you can write the java expression:
 */

    // Replace with your integer value for 'm'
    int m = 5;
    int r = 3;

    double result = (double) m * Math.pow(r,2);
        System.out.println("Result: " + result);




    }
}
