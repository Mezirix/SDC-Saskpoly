package MidTerm;
//
//
import java.util.Scanner;
//
public class WithUncleA {
//    public static int main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        {
//
//            ( int min, int max);{
//            return (int) ((Math.random() * (max - min)) + min);
//        }
//        }
//    }
//}

public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
        }

    public static void main(String[] args) {
//         Create a scanner object to read input
        Scanner input = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a Number: ");
        int inputInt = Integer.parseInt(input.nextLine());
//        Scanner.close();

        int random = getRandomNumber(1, 6);

        if (random == inputInt)
            System.out.println("You Win");
        else
            System.out.println("You Lose");
    }
}

