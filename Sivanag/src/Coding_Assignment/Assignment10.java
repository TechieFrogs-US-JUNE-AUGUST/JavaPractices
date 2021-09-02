package src.Coding_Assignment;
import java.util.Scanner;
public class Assignment10 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int rows = scannerObj.nextInt();
        System.out.print("Enter Number of Columns : ");
        int cols =scannerObj.nextInt();
        int[][] matrix =new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
                {
                    matrix[i][j]=scannerObj.nextInt();
                }
        }
        System.out.println("Given Matrix is ");
        displayMatrix(matrix);
        for(int i=0;i<rows;i++)
        {
            sortRows(i, matrix);
        }
        System.out.println("Row wise Sorted Matrix is ");
        displayMatrix(matrix);
        scannerObj.close();
    }
    static void sortRows(int row,int[][] matrix)
    {
        int[][] temp =new int[1][1];
        for(int i=0;i<matrix[row].length;i++)
        {
            for(int j=i;j<matrix[row].length;j++)
            {
                if(matrix[row][i]>matrix[row][j])
                {
                    temp[0][0]=matrix[row][i];
                    matrix[row][i]=matrix[row][j];
                    matrix[row][j]=temp[0][0];
                }
                
            }
        }
    }    
    static void  displayMatrix(int[][] matrix)
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
