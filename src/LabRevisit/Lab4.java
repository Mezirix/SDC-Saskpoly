package LabRevisit;

public class Lab4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int result = i * j;
                System.out.print(result + "\t"); // Use \t for formatting
            }
            System.out.println(); // Move to the next line
        }
    }
}
