import java.util.Scanner;
class LeftpascalTriangle
{
    public static void main(String args[])
    {
        System.out.print("Enter the Number of Rows you want to print : ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
         for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<=n-i)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println("");
        }
 for(int k=1;k<=n;k++)
        {
            for(int l=1;l<=n;l++)
            {
                if(l<k)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println("");
        }
         sc.close();
 }
} 
