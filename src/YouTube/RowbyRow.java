package YouTube;

public class RowbyRow
{
    public static void main(String[] args) {
//        Let's say you have list of numbers, you are asked to print them in rows.
//        firstly you must have two loops; i & j. then iterate through them.
        int [][] integers = { {3, 5, 7}, {10, 2, 9} };
//        iterating through.
        for (int i = 0; i < 2; i++) // it will always be less than because it starts counting from zero (0)
        {
            for (int j = 0; j < 3; j++ )
                System.out.println(integers[i][j] + " ");

            System.out.println();
        }
    }
}
