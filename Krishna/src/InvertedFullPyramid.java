import java.util.Scanner;
public class InvertedFullPyramid {
    public static void main(String[] args) 
    {
     int i,j,k,l;
Scanner sc = new Scanner(System.in);
System.out.print("enter value of n:");
int n = sc.nextInt(); 
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=n;k>=i;k--)
            {
                System.out.print("*");
            }
            for(l=n-1; l>=i;l--)
            {
                System.out.print("*");
            }System.out.println();
        }
        sc.close();
    }
}