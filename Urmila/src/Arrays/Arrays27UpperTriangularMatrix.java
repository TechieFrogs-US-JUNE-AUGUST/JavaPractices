package Arrays;
import java.util.Scanner;
public class Arrays27UpperTriangularMatrix 
{
    public static void UpperTriangle(int array[][]) // Method uesd to print the values of lower triangle
    {        
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                if(i>j)                                // element of row is greater than the coloumn element
                    System.out.print("0");
                else
                    System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {                 
        int array1[][]=new int[3][3];                     //initialising the array variables
        Scanner scanner= new Scanner(System.in);
        System.out.println("Elements of array are:");
        for(int i=0;i<array1.length;i++) 
        {
            for (int j = 0; j < array1.length; j++) 
            {
                array1[i][j] = scanner.nextInt();
            }
        }
        UpperTriangle(array1);           // Callimg created method to print elements of array
    }
}
