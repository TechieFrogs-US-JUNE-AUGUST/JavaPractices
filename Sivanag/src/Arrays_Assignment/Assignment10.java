package Arrays_Assignment;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);
        System.out.print("Array Size : ");
        int size=scannerObj.nextInt();
        System.out.println("Enter Array Elements: ");
        String[] array1=new String[size];
        for(int i=0;i<size;i++)
        {
            array1[i]=scannerObj.next();
        }
        Assignment1.displayArray(array1);
        int lnum=1000;
        String lele=" ";
        for(int j=0;j<size;j++)
        {
            if(array1[j].length()<lnum)
            {
                lnum=array1[j].length();
                lele=array1[j];
            }
        }
        System.out.println("Smallest Element in Array is : " + lele);
        scannerObj.close();
    }
    
}
