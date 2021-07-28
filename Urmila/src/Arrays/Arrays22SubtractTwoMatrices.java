package Arrays;
import java.util.Scanner;
public class Arrays22SubtractTwoMatrices 
{
    public static void main(String[] args)
    {
     int row, column,i,j;
      Scanner scanner = new Scanner(System.in);
 
      System.out.println("Enter the number of rows");
      row = scanner.nextInt();
     
      System.out.println("Enter the number  columns");
      column  = scanner.nextInt();
    
      int matrix1[][] = new int[row][column];
      int matrix2[][] = new int[row][column];
      int matrix3[][] = new int[row][column];
 
      System.out.println("Enter the elements of matrix1");
 
      for (  i= 0 ; i < row ; i++ )
       {   
            for ( j= 0 ; j < column ;j++ )
            {
            matrix1[i][j] = scanner.nextInt();
            }    
       }
      System.out.println("Enter the elements of  matrix2");
      for (  i= 0 ; i < row ; i++ )
       {
               
         for ( j= 0 ; j < column ;j++ )
         {
         matrix2[i][j] = scanner.nextInt(); 
         }     
       }
        for (  i= 0 ; i < row ; i++ )
        {
          for ( j= 0 ; j < column ;j++ )
          {
          matrix3[i][j] =  matrix1[i][j] - matrix2[i][j]  ;   
 
          System.out.println("subtract  of  two matrices:");
          }
        }
 
        for (  i= 0 ; i < row ; i++ )
        {  
            for ( j= 0 ; j < column ;j++ )
            {
            System.out.print(matrix3[i][j]+" ");
            }
         System.out.println();
        }
 
    }
    
}
