package arrays;

import java.util.Scanner;

public class Arrays30 {
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
            for(int i=0;i<rows;i++)
            {
                int sumRows=0;
                for (int j=0;j<columns;j++)
                {
                    sumRows=sumRows+matrix[i][j];
                    
                }
                System.out.println("Sum of " + (i+1) + " Rows " +sumRows);
            }
            for(int i=0;i<columns;i++)
            {
                int sumColumns=0;
                for (int j=0;j<rows;j++)
                {
                    sumColumns=sumColumns+matrix[j][i];
                    
                }
                System.out.println("Sum of " + (i+1) + " Columns " +sumColumns);
            }
            scannerObj.close();
    }
    
}
