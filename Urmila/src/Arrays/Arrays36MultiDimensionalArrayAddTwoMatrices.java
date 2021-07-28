package Arrays;
import java.util.Scanner;
public class Arrays36MultiDimensionalArrayAddTwoMatrices 
{
    public static void main(String[] args)
    {
        int array1[][] = new int[2][3];
        int array2[][] = new int[2][3];
        int array3[][] = new int[2][3];
        Scanner scanner = new Scanner(System.in);// scanner used to read input by user
        for (int i = 0; i < array1.length; i++) // loop used to iterates array1
        {
            for (int j = 0; j < array1[i].length; j++) 
            {
                array1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array2.length; i++) // loop used to iterate array2
         {
            for (int j = 0; j < array2[i].length; j++) 
            {
                array2[i][j] = scanner.nextInt();
            }
        }
        add(array1,array2,array3);
    }
    public static void add(int arrayA[][], int arrayB[][], int arrayC[][])
     {
        System.out.println("First array:");
        for (int i = 0; i < arrayA.length; i++) 
        {
            for (int j = 0; j < arrayA[i].length; j++) 
            {
                System.out.print( arrayA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second array:");
        for (int i = 0; i < arrayB.length; i++) 
        {
            for (int j = 0; j < arrayB[i].length; j++) 
            {
                System.out.print( arrayB[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Addition of first and second matrix:");
        for (int i = 0; i < arrayC.length; i++) 
        {
            for (int j = 0; j < arrayC[i].length; j++) 
            {
                arrayC[i][j] = arrayA[i][j] + arrayB[i][j];
                System.out.print( arrayC[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
