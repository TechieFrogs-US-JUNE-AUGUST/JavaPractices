package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class Arrays41 {
    public static void concatinateArray(int a[],int b[]) {
        System.out.println("the values of first array are:");       // method for concatinate 2 arrays
        for (int i = 0; i < a.length; i++) {                     // to print the values of first array
            System.out.println(a[i] + ",");
        }
        System.out.println("the values of second array are:");
        for (int i = 0; i < b.length; i++) {                       // to print the values of second array
            System.out.println(b[i] + ",");
        }
        System.out.println("After concatinate the array1 and array2 are:");
        int c = a.length + b.length;
        int c1[] = new int[c];                               //created another array to concatinate the both the arrays
        System.arraycopy(a, 0, c1, 0, a.length);
            System.arraycopy(b, 0, c1, a.length, b.length);
            System.out.println(Arrays.toString(c1));
        }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);                     // scanner object to take the input from the user
        System.out.println("enter the size of an array1:");
        int size;
        size = s.nextInt();
        int a1[] = new int[size];
        System.out.println("enter the values of an array2:");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = s.nextInt();
        }
        System.out.println("enter the size of an array2:");
        int size2;
        size2 = s.nextInt();
        int b1[] = new int[size2];
        System.out.println("enter the values of an array2:");
        for (int i = 0; i < b1.length; i++) {
            b1[i] = s.nextInt();
        }
        concatinateArray(a1,b1);                          //calling created method
    }
}