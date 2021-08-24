package src.Coding_Assignment;

import java.util.Scanner;

public class Assignment22 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.print("Enter Binary Array Size : ");
        int size = scannerObj.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scannerObj.nextInt();
        }
        int temp=1,a=1;
        for(int j=1;j<size;j++)
        {
            
            if(array[j]==array[j-1])
            {
                a++;
            }else
            a=1;
            if(temp<a)
            temp=a;
           
        }
        System.out.println("Max number of Consecutives is : " +temp);
        scannerObj.close();
    }
    
}
