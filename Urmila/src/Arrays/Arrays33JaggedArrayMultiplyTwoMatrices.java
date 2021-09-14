package Arrays;
import java.util.Scanner;
public class Arrays33JaggedArrayMultiplyTwoMatrices 
{
    public static void main(String[] args)
    {
            int a[][]=new int[2][3];                  // created two jagged arrays
            int b[][]=new int[2][3];
            int c[][]=new int[2][3];
             a[0]=new int[2];
             a[1]=new int[3];
             b[0]=new int[2];
             b[1]=new int[3];
             Scanner scanner=new Scanner(System.in);
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a[i].length;j++)
                {
                    a[i][j]=scanner.nextInt();
                }
            }
            for(int i=0;i<b.length;i++)
            {
                for(int j=0;j<b[i].length;j++)
                {
                    b[i][j]=scanner.nextInt();
                }
            }
            System.out.println("elements of first array:");
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("elements of second array:");
            for(int i=0;i<b.length;i++){
                for(int j=0;j<b[i].length;j++){
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("multiplication of two matrices are:");
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    c[i][j]=0;                      //created another matrix to store matrix multiplication
                    for(int k=0;k<2;k++) {
                        c[i][j] = c[i][j] + a[i][k] * b[k][j];
                    }
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
    }
    
}
