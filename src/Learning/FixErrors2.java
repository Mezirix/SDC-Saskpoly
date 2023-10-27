package Learning;

import java.util.Scanner;

public class FixErrors2 {
    public static void main(String[] args) {

//        create a scanner object
        Scanner input = new Scanner(System.in);

//        Prompt the user to enter a radius
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();

//        compute area
        double area = radius * radius * 3.14159;

//        Display results
        System.out.print("The area for the circle of radius " + radius + " is " + area);


//        double i = 50.0;
//        double k = i + 50.0;
//        double j = k + 1;
//
//        System.out.println(i is + "  " + j + " "  +  k);
    }
}
