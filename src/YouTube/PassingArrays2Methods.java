package YouTube;

public class PassingArrays2Methods
{
    public static void main(String[] args) {
        int[] numbers = {0, 1};
        change(numbers);
        printArray(numbers);
    }

    public static void change(int[] numbers)
    {
        numbers[0] = 1;
        numbers[1] = 0;
    }

    public static void printArray(int[] numbers)
    {
        for (int i = 0; i<numbers.length; i++)
        System.out.println(numbers[i] + " ");
    }
}
