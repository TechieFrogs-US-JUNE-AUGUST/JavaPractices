package Arrays;

public class Arrays39FindTransposeOfAMatrices 
{
    public static void main(String[] args)
    {
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};//Initializing an array elements
        int rows= array.length;
        int columns= array[0].length;

        int array1[][]= new int[columns][rows]; //used to declare an array  with reverse dimensions

        for(int i=0; i<columns; i++)//loop used for calculating tranpose of matrix
        {           
            for(int j=0; j<rows; j++)
            {
                array1[i][j] = array[j][i]; //converts the row of original matrix into column of transposed matrix
            }
        }
        System.out.println("Transpose of the given matrix is: ");
        for(int i=0; i<columns; i++)
        {
        for(int j=0; j<rows; j++)
        {
            System.out.print(array1[i][j]+" ");
        }
        System.out.println();
        }
    }
    
}
