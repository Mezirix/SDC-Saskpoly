package Learning2;

public class IfStatement {
    public static void main(String[] args) {
        double radius =0;
        if (radius < 0) {
            System.out.println("Incorrect input");
        }
        else {
            double area = radius * radius * 3.14159;
            System.out.println("Area is " + area);
        }
    }
}
