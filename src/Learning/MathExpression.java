package Learning;
// Write a statement to display the result of 2^3.5
public class MathExpression {
    public static void main(String[] args) {

        double base = 2.0;
        double exponent = 3.5;

        double result = Math.pow(base, exponent);
        System.out.println("2^3.5 = " + result);

    }
}
