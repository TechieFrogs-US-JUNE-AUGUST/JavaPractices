package src.Coding_Assignment;

import java.util.Scanner;

public class Assignment12 {
    Scanner scannerObj=new Scanner(System.in);
    public static void main(String[] args) {
        Assignment12 obj=new Assignment12();
        System.out.print("Enter Number of Rows and Colums in a matrix : ");
        int n=obj.scannerObj.nextInt();
        int[][] matrix =new int[n][n];
        for(int i=0;i<=(n);i++)
        {
          right(i, n, matrix);
          bottom(i, n, matrix);
          left(i,n-1,matrix);
          top(i,n-1,matrix);
          n--;
        }
        displayMatrix(matrix);
        obj.scannerObj.close();
    }
    static void right(int i,int n,int[][] matrix)
    {
        Assignment12 obj1=new Assignment12();
        for(int k=i;k<n;k++)
        {
            matrix[i][k]=obj1.scannerObj.nextInt();
        }

    }
    static void bottom(int i,int n,int[][] matrix)
    {
        Assignment12 obj1=new Assignment12();
        for(int k=i+1;k<n;k++)
        {
            matrix[k][n-1]=obj1.scannerObj.nextInt();
        }
    }
    static void left(int i,int n,int[][] matrix)
    {
        Assignment12 obj1=new Assignment12();
        for(int k=n-1;k>=i;k--)
        {
            matrix[n][k]=obj1.scannerObj.nextInt();
        }
    }
    static void top(int i,int n,int[][] matrix)
    {
        Assignment12 obj1=new Assignment12();
        for(int k=n-1;k>i;k--)
        {
            matrix[k][i]=obj1.scannerObj.nextInt();
        }
    }
    static void displayMatrix(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
