package arrays;

import java.util.Scanner;

public class Arrays39 {
    public static void main(String[] args) {
        int array[][]=new int[5][5];
        System.out.println("Number of Rows :");
        Scanner scannerObj=new Scanner(System.in);
        int rows=scannerObj.nextInt();
        System.out.println("Number of Columns :");
        int columns=scannerObj.nextInt(); 
        int transposeMatrix[][]=new int[5][5];
        System.out.println("Enter elements of the Matrix :");
        for(int i=0;i<rows;i++)
            {
                for (int j=0;j<columns;j++)
                {
                    array[i][j]=scannerObj.nextInt();//getting input from the user
                }
            }
            for(int i=0;i<rows;i++)
            {
                for (int j=0;j<columns;j++)
                {
                    transposeMatrix[j][i]=array[i][j];//frst row becomes frst column and simultaneously
                }
            }
        System.out.println("Transpose of given Matrix is :");
        for(int i=0;i<rows;i++)
            {
                for (int j=0;j<columns;j++)
                {
                    System.out.print( transposeMatrix[i][j]);
                }
            }
            scannerObj.close();
    }
    
}
