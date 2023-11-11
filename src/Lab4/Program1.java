package Lab4;

/**
 * Purpose:             Program to create a multiplication table  <br />
 *                      for numbers 1 to 9. <br />
 * Data Submitted:      10/05/2023 <br />
 * Assignment Number:   Lab4, Program1  <br />
 * Course Name:         COSC600  <br />
 * Instructor:          George Ding  <br />
 * File Path:          	Lab4/Program1.java <br />
 * @author        	    Christiantus Chimeziri Anyanwu <br />
 *			            (anyanwu8189) - Student
 * @version            1.0.0
 */
//public class Program1 {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 9; i++)
//        {
//            for (int j = 1; j <= 9; j++)
//            {
//                int result = i * j;
//                System.out.print(result + "\t");
//            }
//            System.out.println();
//        }
//    }

public class Program1 {
    public static void main(String[] args) {
        int[] palindromicPrimes = pallPrimeInt(); // Get the palindromic primes

        // Display the found palindromic primes
        System.out.println("The first 50 palindromic primes:");
        for (int prime : palindromicPrimes) {
            if (prime != 0) { // Check for non-zero values in the array
                System.out.print(prime + " ");
            }
        }
    }

    // Place the pallPrimeInt method here


    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // Check if the number is a prime
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int temp = number;
        int reverse = 0;

        // Check if the number is a palindrome
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        return number == reverse;
    }
    public static int[] pallPrimeInt() {
        int[] palindromicPrimes = new int[50]; // Array to store 50 palindromic primes
        int count = 0; // Counter to keep track of how many palindromic primes are found

        // Check for palindromic primes using a for loop
        for (int num = 2; count < 50; num++) {
            // Check if the number is both prime and a palindrome
            if (isPrime(num) && isPalindrome(num)) {
                palindromicPrimes[count] = num; // Store the palindromic prime in the array
                count++; // Increment the counter
            }
        }

        return palindromicPrimes; // Return the array of palindromic primes
    }

}
