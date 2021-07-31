package Arrays;
import java.util.Scanner;
public class Arrays32JaggedArrayAddTwoMatrices 
{
    public static void main(String[] args)
    {
        int array1[][] = new int[2][3];
        int array2[][] = new int[2][2];
        int array3[][] = new int[2][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) 
        {
            for (int j = 0; j < array1[i].length; j++) 
            {
                array1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array2.length; i++) 
        {
            for (int j = 0; j < array2[i].length; j++) 
            {
                array2[i][j] = scanner.nextInt();
            }
        }
        jagged(array1,array2,array3);
    }
    public static void jagged(int array4[][], int array5[][], int array6[][]) 
    {
        System.out.println("print First array:");
        for (int i = 0; i < array4.length; i++) 
        {
            for (int j = 0; j < array4[i].length; j++)
            {
                System.out.print( array4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Print second array:");
        for (int i = 0; i < array5.length; i++) 
        {
            for (int j = 0; j < array5[i].length; j++) 
            {
                System.out.print( array5[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("addition of first and second matrix:");
        for (int i = 0; i < array6.length; i++)
        {
            for (int j = 0; j < array6[i].length; j++) 
            {
                array6[i][j] = array4[i][j] + array5[i][j];
                System.out.print( array6[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
