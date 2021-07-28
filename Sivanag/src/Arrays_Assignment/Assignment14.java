package Arrays_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment14 {
    public static int[] assignArray()
    {
        Scanner scannerObj= new Scanner(System.in);
        System.out.print("Enter Length of an Array : ");
        int size=scannerObj.nextInt();
        System.out.println("Enter Array Elements");
        int[] array1=new int[size];
        for(int i=0;i<size;i++)
        {
            array1[i]=scannerObj.nextInt();
        }
        scannerObj.close();
        return array1;
    }
    public static void main(String[] args) {
        int[] array1=assignArray();
        Arrays.sort(array1);
        Assignment1.displayArray(array1);
    }
    
}
