package Arrays_Assignment;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);
        System.out.print("Array Size : ");
        int size=scannerObj.nextInt();
        System.out.println("Enter Array Elements: ");
        int[] array1=new int[size];
        for(int i=0;i<size;i++)
        {
            array1[i]=scannerObj.nextInt();
        }
        System.out.println("Given Array ");
        Assignment1.displayArray(array1);
        System.out.println("Display elements at Odd Position");
        for(int i=1;i<array1.length;i+=2)
        {
            System.out.print(array1[i] +" ");
        }
        System.out.println();
        scannerObj.close();
    }
}
