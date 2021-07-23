package Arrays_Assignment;

import java.util.Scanner;

public class Assignment9 {
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
        int hnum=0;
        for(int j=0;j<size;j++)
        {
            if(array1[j]>hnum)
                hnum=array1[j];
        }
        System.out.println("Biggest number in Array is : " + hnum);
        scannerObj.close();
    }

    
}
