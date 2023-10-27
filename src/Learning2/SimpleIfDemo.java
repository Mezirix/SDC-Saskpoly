package Learning2;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
//
//        int y = 0;
//        if (y > 0) {

//        }



////        if (score >= 90) {
////            System.out.println(Increase pay + " 3%");
////        }
////        else {
////            System.out.println();
//        }


        System.out.println("  x = 1");

        if (number % 5 == 0)
            System.out.println("HiFive");

        if (number %2 == 0)
            System.out.println("HiEven");
    }
}
