package Arrays;

import java.util.Scanner;

public class Arrays32 {
    public static void main(String[] args) {
        int a[][] = new int[2][3];
        int b[][] = new int[2][2];
        int c[][] = new int[2][3];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = s.nextInt();
            }
        }
        jagged(a,b,c);
    }
    public static void jagged(int ar[][], int br[][], int cr[][]) {
        System.out.println("first array:");
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print( ar[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("second array:");
        for (int i = 0; i < br.length; i++) {
            for (int j = 0; j < br[i].length; j++) {
                System.out.print( br[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("addition of first and second matrix:");
        for (int i = 0; i < cr.length; i++) {
            for (int j = 0; j < cr[i].length; j++) {
                cr[i][j] = ar[i][j] + br[i][j];
                System.out.print( cr[i][j] + " ");
            }
            System.out.println();
        }
    }
}