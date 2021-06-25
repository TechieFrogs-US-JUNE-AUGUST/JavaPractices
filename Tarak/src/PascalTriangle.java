

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = sc.nextInt();
        System.out.println("* Printing the pattern... *");
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            int temp = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(temp + " ");
                temp = temp * (i - k) / (k);
            }
            System.out.println();

        }
    }
}