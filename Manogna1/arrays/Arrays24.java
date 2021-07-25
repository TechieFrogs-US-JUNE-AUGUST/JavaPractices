package arrays;

import java.util.Scanner;

public class Arrays24 {
    public static void main(String[] args) {
        int array[][]=new int[5][5];
        System.out.println("Number of Rows :");
        Scanner scannerObj=new Scanner(System.in);
        int rows=scannerObj.nextInt();
        System.out.println("Number of Columns :");
        int columns=scannerObj.nextInt(); 
        System.out.println("Enter elements of the Matrix :");
            for(int i=0;i<rows;i++)
            {
                for (int j=0;j<columns;j++)
                {
                    array[i][j]=scannerObj.nextInt();//getting input from the user
                }
            }
        int size=rows*columns;
        int count=0;
        for(int i=0;i<rows;i++)
            {
                for (int j=0;j<columns;j++)
                {
                    if(array[i][j]==0)//if thers is zero in any element count will get increased
                    {
                        count++;
                    }
                }
            }
        if(count>size/2) //to be a sparse matrix count of zero elements should be greater than size/2
        {
            System.out.println("Given Matrix is a Sparse Matrix ");
        }  
        else
        {
            System.out.println("Given Matrix is not a Sparse Matrix ");
        } 
        scannerObj.close();
    }
    
}
