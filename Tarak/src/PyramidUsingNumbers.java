

import java.util.Scanner;

public class PyramidUsingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of lines to be printed");
        int n = sc.nextInt();
        int k, l = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            for (k =2; k <= i; k++) {
                System.out.print(" " + (k + i-2));
            }
            for (l = i; l >= 1; l--) {
                System.out.print(" " + (l + i - 1));
            }
            System.out.println();
        }
    }
}
