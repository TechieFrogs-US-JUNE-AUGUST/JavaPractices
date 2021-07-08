import java.util.Scanner;
public class DiamondPattern{
    public static void main(String[ ] args)
     {
        // int i,j,l;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter value of n:");
        int n=sc.nextInt();
           for(int i=1; i<=n; i++)
           {
               for(int j=1; j<=n-i; j++)
               {
                   System.out.print(" ");
               }
               int k=0;
               while( k!=2*i-1)
               {
                   System.out.print("*");
                   k++;
               }
               System.out.println();
           }
            for(int i=1; i<=n; i++)
            {
                for(int j=2; j<=i;j++)
                {
                    System.out.print(" ");
                }
                    for(int k=n;k>=i;k--)
                      {
                        System.out.print("*");
                      }
                    for(int l=n-1; l>=i;l--)
                       {
                        System.out.print("*");
                       }
                       System.out.println();
             }
    sc.close();
    }
}