package Arrays;
import java.util.Scanner;
public class Arrays23IdentityMatrix 
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the rows of array");
         int row=scanner.nextInt();
        System.out.println("Enter  the coloumns of array");
         int column=scanner.nextInt();
        int matrix[][]=new int[row][column];
        System.out.println("Enter the elements of matrix-1");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
            matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("input matrix is");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
            System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        boolean flag=true;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if((i==j && matrix[i][j]!=1)&&(i!=j && matrix[i][j]!=0))
                {
                     flag=false;
                }
                if((i!=j && matrix[i][j]!=0))
                {
                    flag=false;
                }
            }
        }
        if(flag)
        {
            System.out.println("It is an Identity matrix");
        }
        else
        System.out.println("It is not an Identity matrix");  
    }
    
}
