package Arrays;
import java.util.Scanner;
public class Arrays26LowerTriangularMatrices 
{
    public static void LowerTriangle(int array[][])// Method used to print lower triangle
    {
        for(int i=0;i<array.length;i++)// loop used to iterate values to get lowertriangle matrix
        {
            for(int j=0;j<array[i].length;j++)
            {
                if(j>i)                                // element of coloumn is greater than the row element
                    System.out.print("0 ");
                else
                    System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {                
        int array1[][]=new int[3][3];            //initializing array elements      
        Scanner scanner= new Scanner(System.in);
        System.out.println("Elements of array are:");
        for(int i=0;i<array1.length;i++)
        {
            for (int j = 0; j < array1.length; j++)
            {
                array1[i][j] = scanner.nextInt();
            }
        }
          LowerTriangle(array1);         // Callimg created method to print elements of array
    
    }

}
//Lower triangular matrix is a square matrix in which all the elements above the principle diagonal will be zero. 
// A matrix needs to be a square matrix that 