package MidTerm;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = input.nextLine();


        System.out.println("Enter two intergers: ");
        String[] integerInputs = input.nextLine().split(" ");


        if (integerInputs.length == 2) {
            try {
                int start = Integer.parseInt(integerInputs[0]);
                int end = Integer.parseInt(integerInputs[1]);

                if (start >= 0 && end >= start && end < inputString.length()) {
                    String result = inputString.substring(start, end + 1);
                    System.out.println(result);
                } else {
                    System.out.println("Invalid input. Please make sure integers are within the valid range. ");
                }

            }catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter two valid integers . ");
            }
        }else {
            System.out.println("Invalid input. Please enter two integers separated by a space. ");
        }
    }
}
