package Learning;

public class ComputePerimeterArea {
    public static void main(String[] args) {
        double radius = 6.5;
        double pi = 3.14159;

        // Calculate perimeter
        double perimeter = 2 * radius * pi;

        // Calculate area
        double area = radius * radius * pi;

        // Display the results
        System.out.println("Radius: " + radius);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
