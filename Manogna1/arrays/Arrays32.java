package arrays;

import java.util.Scanner;

public class Arrays32 {
    public static void main(String[] args) {
        int matrix1[][]=new int[3][];
        int matrix2[][]=new int[3][];
         matrix1[0]=new int[3];
         matrix1[1]=new int[2];
         matrix1[2]=new int[4];
         matrix2[0]=new int[3];
         matrix2[1]=new int[4];
         matrix2[2]=new int[2];
         Scanner scannerObj=new Scanner(System.in);
         System.out.println("Enter the elements in Matrix1");
         for(int i=0;i<matrix1.length;i++)
         {
             for(int j=0;j<matrix1[i].length;j++)//if i=1,matrix1[i]=2columns 
             {
                 matrix1[i][j]=scannerObj.nextInt();
             }
         }
         for(int i=0;i<matrix1.length;i++)
        {
             for(int j=0;j<matrix1[i].length;j++)
            {
                 System.out.print(matrix1[i][j] + "  ");
            }
              System.out.println();

        }
        System.out.println("Enter the elements in Matrix2");
         for(int i=0;i<matrix2.length;i++)
         {
             for(int j=0;j<matrix2[i].length;j++)//if i=1,matrix2[i]=4columns 
             {
                 matrix2[i][j]=scannerObj.nextInt();
             }
         }
         for(int i=0;i<matrix2.length;i++)
        {
             for(int j=0;j<matrix2[i].length;j++)
            {
                 System.out.print(matrix2[i][j] + "  ");
            }
              System.out.println();

        }

                //two arrays can be added only the dimensions of those two are same so we canot add two jagged arrays  

        scannerObj.close();
    }
    
}
