package Learning;

public class ComputePerimeterRectangle {
    public static void main(String[] args) {

//        Define the width and the Perimeter
        double width = 5.3;
        double height = 6.5;

//        Calculate the area and perimeter.
        double area = width * height;
        double perimeter = 2 * (width + height);

//        Print Result.
        System.out.println( "Rectangle area: "+ area);
        System.out.println("Rectangle perimeter: "+ perimeter);
    }
}
