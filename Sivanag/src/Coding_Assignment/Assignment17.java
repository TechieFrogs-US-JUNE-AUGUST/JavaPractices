package src.Coding_Assignment;

import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int size=scannerObj.nextInt();
        int[][] matrix =new int[size][size];
        int[][] maxMatrix =new int[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                matrix[i][j]=scannerObj.nextInt();
            }
        }
        int maxvalue=1;
        for(int i=0;i<size;i++)
        {
            int tempvalue=1;
            for(int j=0;j<size;j++)
            {
                if(i==0 && j==0)
                    maxvalue=matrix[i][j];
                if(i>0)
                {
                tempvalue=maxMatrix[i-1][j]*matrix[i][j];
                maxvalue=Math.max(maxvalue, tempvalue);
                }
                if(j>0)
                {
                    tempvalue=maxMatrix[i][j-1]*matrix[i][j];
                    maxvalue=Math.max(maxvalue, tempvalue);
                }
                maxMatrix[i][j]=maxvalue;
                
            }
          
        }
        Assignment12.displayMatrix(matrix);
        System.out.println("Max Proudct of Mutidimentional Array is: " +maxMatrix[size-1][size-1]);
        scannerObj.close();


    }
    
}
