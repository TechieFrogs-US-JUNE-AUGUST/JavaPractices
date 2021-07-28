package Arrays;
import java.util.Scanner;
public class Arrays24SparseMatrix 
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);            //reading the i/p from user by using scanners
        int rows, columns;
        System.out.println("Enter the size of rows: ");
        rows= scanner.nextInt();
        System.out.println("Enter the size of columns: ");
        columns= scanner.nextInt();

        int array[][]= new int[rows][columns];                  //initialisation 

        System.out.println("Enter the elements: ");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                array[i][j]= scanner.nextInt();
            
        }
        //to check if the no.of zero elements are more than the no.of non-zero elements
        int zero= 0, count= 0;     //taking 2 variables as counters for zero and non-zero elements
        for(int k=0; k<rows; k++)
        {
            for(int j=0; j<columns; j++)
            {
                if(array[k][j] == 0)
                {                 //checks the condition for every element in the matrix
                    zero++;       //if the condition is true it increments zero counter value by 1
                }
                else
                {
                    count++;         //else it increments the non-zero elemnts counter by value 1
                }
            }
        }
    if(zero> count)
        System.out.println("It is a Sparse matrix");
    else
        System.out.println("It is not a Sparse matrix");
        scanner.close();
    }
    
}
}