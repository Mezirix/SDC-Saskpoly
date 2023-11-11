package YouTube;

public class columnBycolumn
{
    public static void main(String[] args) {

        int [][] integers = {
                {3, 5, 7},
                {10, 2, 9}
        };
    for (int i = 0; i < 3; i++)
    {
        for(int j = 0; j < 2; j++)
            System.out.println(integers[j][i] + " ");

        System.out.println();
    }

//        This is how it works.
//        print first column.
//        System.out.println(integers[0][0] + " ");
//        System.out.println(integers[1][0] + " ");
//
//       print second column
//        System.out.println(integers[0][1] + " ");
//        System.out.println(integers[1][1] + " ");
//
//      print third column
//        System.out.println(integers[0][2] + " ");
//        System.out.println(integers[1][2] + " ");


    }
}
