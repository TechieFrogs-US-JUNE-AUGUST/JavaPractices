package Patternsjava;
import java.util.Scanner;
public class InvertedHalfPyramid 
{
    public static void main(String[] args)
{
   /* int i,j;
    System.out.println("Enter the number of rows");
    for(i= 5;i>=1;--i)
    {
        for(j=1;j<=i;++j)
        {
            System.out.print("*");

        }
        System.out.println();
    }*/
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number of rows:");
    int n = scanner.nextInt();
    int i,j;
    for(i=n;i>0;--i)// outer loop
    {
        for(j=1;j<=i;++j) //inner loop
        {
              System.out.print("*");

        }
        System.out.println();
    
     }
}

    
}
