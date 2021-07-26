package Arrays_Assignment;

import java.util.Scanner;

public class Assignment6 {
    static void displayArrayRev(int[] ar)
    {
        for(int i=ar.length-1;i>=0;i--)
        {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
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
        System.out.println("Reverse Given Array");
        displayArrayRev(array1);
        scannerObj.close();

    }
    
}
