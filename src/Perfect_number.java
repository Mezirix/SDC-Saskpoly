public class Perfect_number
{
    static int isPerfect(int n)
    {
        // 1 is not a perfect number
        if (n == 1)
            return 0;

        // sum will store the sum of proper divisors
        // As 1 is a proper divisor for all numbers
        // initialised sum with 1
        int sum = 1;

        // Looping through the numbers to check if they are
        // divisors or not
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {

                sum += i;

            }
        }

        // If sum of divisors is equal to
        // n, then n is a perfect number
        if (sum == n)
            return n;

        return 0;
    }

    public static void  findPerfectIntIn(int intNum)
    {

        for (int num = 2; num < intNum; num++)
        {
            int result = isPerfect(num);
            if (result >   0)
            {
                System.out.println("I am Perfect, I am " +  result);
            }
        }
    }

    public static void main(String[] args)
    {
        int n = 6;

        // Call isPerfect function to
        // check if the number is perfect or not.
        findPerfectIntIn(10000);

    }
}

