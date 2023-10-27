package Learning;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");

        double celsius = input.nextDouble();

//        Convert Celsius to Fahrenheit
        double fahrenheit = (9.0 / 5) * (celsius + 32);
        System.out.println("Celsius  " + celsius + " is " + fahrenheit + " in fahrenheit");
    }
}
