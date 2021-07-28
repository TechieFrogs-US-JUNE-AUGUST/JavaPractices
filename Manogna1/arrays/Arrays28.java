package arrays;

import java.util.Scanner;

public class Arrays28 {
    public static void main(String[] args) {
        System.out.println("Number of Rows :");
        Scanner scannerObj=new Scanner(System.in);
        int rows=scannerObj.nextInt();
        System.out.println("Number of Columns :");
        int columns=scannerObj.nextInt(); 
        int array[][]=new int[rows][columns];
        System.out.println("Enter elements of the Matrix :");
            for(int i=0;i<rows;i++)
            {
                for (int j=0;j<columns;j++)
                {
                    array[i][j]=scannerObj.nextInt();//getting input from the user
                }
            }
        int countEven=0,countOdd=0;
        for(int i=0;i<rows;i++)
            {
                for (int j=0;j<columns;j++)
                {
                   if(array[i][j]%2==0)//if it is divisible by 2 its even else odd
                   {
                       countEven++;
                   }
                   else
                   {
                       countOdd++;
                   }
                }
            }
            System.out.println("Frequency of Even Numbers :" +countEven);
            System.out.println("Frequency of Odd Numbers :" +countOdd);
            scannerObj.close();
    }
    
    
}
