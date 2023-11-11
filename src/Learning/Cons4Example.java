package Learning;

//public class cons4Example
//{
    public class Cons4Example {
        public static void main(String[] args) {
            // Sample array
            char[][] sampleArray = {
                    {'K', 'R', 'C', 'N', 'K'},
                    {'B', 'B', 'J', 'M', 'E'},
                    {'B', 'R', 'Y', 'C', 'E'},
                    {'B', 'A', 'N', 'B', 'F'},
                    {'B', 'W', 'R', 'K', 'E'}
            };

            // Check for 4 consecutive identical characters
            boolean result = isCons4(sampleArray);

            if (result) {
                System.out.println("The array contains 4 consecutive identical characters.");
            } else {
                System.out.println("The array does not contain 4 consecutive identical characters.");
            }
        }

        // Method to check for 4 consecutive identical characters
        public static boolean isCons4(char[][] aSample) {
            int m = aSample.length;
            int n = aSample[0].length;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    // Check rows for 4 consecutive identical characters
                    if (j + 3 < n && checkRow(aSample, i, j)) {
                        return true;
                    }
                    // Check columns for 4 consecutive identical characters
                    if (i + 3 < m && checkCol(aSample, i, j)) {
                        return true;
                    }
                    // Check diagonals for 4 consecutive identical characters
                    if (i + 3 < m && j + 3 < n && checkDiagonal(aSample, i, j)) {
                        return true;
                    }
                }
            }
            return false;
        }

        // Helper method to check for 4 consecutive identical characters in a row
        public static boolean checkRow(char[][] aSample, int row, int col) {
            for (int i = 1; i < 4; i++) {
                if (aSample[row][col + i] != aSample[row][col]) {
                    return false;
                }
            }
            return true;
        }

        // Helper method to check for 4 consecutive identical characters in a column
        public static boolean checkCol(char[][] aSample, int row, int col) {
            for (int i = 1; i < 4; i++) {
                if (aSample[row + i][col] != aSample[row][col]) {
                    return false;
                }
            }
            return true;
        }

        // Helper method to check for 4 consecutive identical characters diagonally
        public static boolean checkDiagonal(char[][] aSample, int row, int col) {
            for (int i = 1; i < 4; i++) {
                if (aSample[row + i][col + i] != aSample[row][col]) {
                    return false;
                }
            }
            return true;
        }
    }

//}
