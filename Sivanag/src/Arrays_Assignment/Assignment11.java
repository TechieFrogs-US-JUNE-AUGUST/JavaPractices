package Arrays_Assignment;

import java.util.Scanner;

public class Assignment11 {
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
      
        System.out.println("Number of elements in Array is : " + array1.length);
        scannerObj.close();
    }

    
}
