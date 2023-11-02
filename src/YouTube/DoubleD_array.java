package YouTube;
// Calculating for Sum of each row.
public class DoubleD_array
{
    public static void main(String[] args) {
        int [][] integers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        // iterating through the row
        for (int i = 0; i < 3; i++) // To calculate for the columns, you swap the variables.
        {
//            // the i = row will turn to 4, j which is column = 3
            int sum = 0;
            for (int j = 0; j < 4; j++)
               sum += integers[i][j]; // you swap thw integers [j][i].

//          you change the the rows to columns.
            System.out.println("The sum of rows" +(i + 1) + ": " + sum);
        }
    }
}
