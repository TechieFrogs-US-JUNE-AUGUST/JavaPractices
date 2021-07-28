package arrays;

import java.util.Scanner;

public class Arrays34 {
    public static void main(String[] args) {
        System.out.println("Number of Rows :");
        Scanner scannerObj=new Scanner(System.in);
        int rows=scannerObj.nextInt();
        System.out.println("Number of Columns :");
        int columns=scannerObj.nextInt(); 
        int matrix[][]=new int[rows][columns];
        System.out.println("Enter elements of the Matrix :");
        for(int i=0;i<rows;i++)
            {
                for (int j=0;j<columns;j++)
                {
                    matrix[i][j]=scannerObj.nextInt();//getting input from the user
                }
            }
            int sum=0;
            int size=rows*columns;
            double average=1;
            for(int i=0;i<rows;i++)
            {
                for (int j=0;j<columns;j++)
                {
                   sum=sum+matrix[i][j];
                   average=sum/size;
                
                }
            }
            System.out.println("Average of given Matrix is : " +average);
            scannerObj.close();
    }
    
}
