package Learning;

//public class ArrayJoiner {
//}
public class ArrayJoiner {

    public static int[] joinArray(int[] aOne, int[] aTwo) {
        int m = aOne.length;
        int n = aTwo.length;
        int[] result = new int[m + n];

        // Copy the elements from the first array to the result
        for (int i = 0; i < m; i++) {
            result[i] = aOne[i];
        }

        // Copy the elements from the second array to the result
        for (int i = 0; i < n; i++) {
            result[m + i] = aTwo[i];
        }

        // Sort the merged array in descending order
        for (int i = 0; i < m + n; i++) {
            for (int j = i + 1; j < m + n; j++) {
                if (result[i] < result[j]) {
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arrayOne = { 3, 19, 22, 14, 7, 8 ,9 };
        int[] arrayTwo = { 12, 7, 2, 8, 4 };

        int[] mergedArray = joinArray(arrayOne, arrayTwo);

        System.out.println("Merged and sorted array in descending order:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
