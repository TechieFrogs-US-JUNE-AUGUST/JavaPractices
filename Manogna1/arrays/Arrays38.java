package arrays;

import java.util.Scanner;

public class Arrays38 {
    public static void main(String[] args) {
        int matrix1[][]=new int[5][5];
        int matrix2[][]=new int[5][5];
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Number of Rows in first Array:");
        int rows1=scannerObj.nextInt();
        System.out.println("Number of Columns in first Array:");
        int columns1=scannerObj.nextInt(); 
        System.out.println("Number of Rows in Second Array:");
        int rows2=scannerObj.nextInt();
        System.out.println("Number of Columns in Second Array:");
        int columns2=scannerObj.nextInt(); 
        if(columns1!=rows2)
        {
            System.out.println("Matrices cannot be multiplied");
        }
        else
        {
        System.out.println("Enter elements of First Matrix :");
            for(int i=0;i<rows1;i++)
            {
                for (int j=0;j<columns1;j++)
                {
                    matrix1[i][j]=scannerObj.nextInt();//getting input from the user
                }
            }
            System.out.println("Enter elements of Second Matrix :");
            for(int i=0;i<rows2;i++)
            {
                for (int j=0;j<columns2;j++)
                {
                    matrix2[i][j]=scannerObj.nextInt();//getting input from the user
                }
            } 
        }
        int[][] product=multiplyMatrices(matrix1,matrix2,rows1,columns1,columns2);
        displayProduct(product);
        scannerObj.close();
    }    

        public static int[][] multiplyMatrices(int[][] matrix1,int[][] matrix2,int rows1,int columns1,int columns2)
        {
                int[][] product=new int[rows1][columns2];
                for(int i=0;i<rows1;i++)
            {
                for(int j=0;j<columns2;j++)
                {
                    for(int k=0;k<columns1;k++)
                    {
                        product[i][j]=product[i][j]+matrix1[i][k]*matrix2[k][j];
                    }
                }    

            }
            return product;
        }
        public static void displayProduct(int[][] product)
        {
            System.out.println("product of two matrices :");
            for(int[] row:product)
            {
                for(int column:row)
                {
                    System.out.print(column +" ");
                }
                System.out.println();
            }
            
                
        }





    
}
