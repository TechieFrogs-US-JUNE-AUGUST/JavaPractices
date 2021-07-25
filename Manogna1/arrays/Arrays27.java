package arrays;

import java.util.Scanner;

public class Arrays27 {
    public static void main(String[] args) 
    {
        int array[][]=new int[5][5];
        System.out.println("Number of Rows :");
        Scanner scannerObj=new Scanner(System.in);
        int rows=scannerObj.nextInt();
        System.out.println("Number of Columns :");
        int columns=scannerObj.nextInt(); 
        if(rows!=columns)//f rows and columns shouls be equal
        {
            System.out.println("Sorry Rows and Columns should be equal");
        }
        else
        {
            System.out.println("Enter elements of the Matrix :");
            for(int i=0;i<rows;i++)
            {
                for (int j=0;j<columns;j++)
                {
                    array[i][j]=scannerObj.nextInt();//getting input from the user
                }
            }
        }
        System.out.println("Input Matrix is :");
        for(int i=0;i<rows;i++)
            {
                for (int j=0;j<columns;j++)
                {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Lower Triangular Matrix is :");
            for(int i=0;i<rows;i++)
            {
                for (int j=0;j<columns;j++)
                {
                   if(j<i)
                   {
                       System.out.print("0 ");
                   }
                   else
                   {
                       System.out.print(array[i][j] + " ");
                   }
                   
                }
                System.out.println();
            }
            scannerObj.close();    
    }

    
}
