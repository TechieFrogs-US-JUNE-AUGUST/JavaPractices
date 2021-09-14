package Arrays;

public class Arrays38MultiplyMatricesPassingMatrixToFunction 
{
    public static void main(String[] args)
    {
        int Matrix1[][]= {{4,5,6},{6,7,6}}; // Initializing an array elements
        int Matrix2[][]= {{1,3,4},{2,8,3}};

        int Matrix3[][]= new int[3][3]; //Matrix3 is product of above twomatrices

        for(int i=0; i<2; i++)  //loop iterates for multiplying and printing  of 2 matrices
        {   
            for(int j=0; j<2; j++)
            {
              Matrix3[i][j]= 0;             
              for(int k=0; k<2; k++)  // each row element of 1st matrix is multiplied by all columns in 2nd matrix
              {
             Matrix3[i][j]= Matrix1[i][k] * Matrix2[j][k]; //implements the condition and stores in  matrix3
              }
           System.out.print(Matrix3[i][j]+" ");       
              }
        System.out.println();
        }  
    }
    
}
