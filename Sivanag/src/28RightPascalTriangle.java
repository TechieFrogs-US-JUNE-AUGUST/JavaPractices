import java.util.Scanner;

class pascalTriangle
{
    public static void main(String args[])
    {
        System.out.print("Enter the Number of Rows you want to print : ");
        Scanner sc= new Scanner(System.in);
        
        int n = sc.nextInt();
        
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int k=n;k>=1;k--)
         {
            for(int l=1;l<k;l++)
             {
                System.out.print("* ");
             }
             System.out.println("");
            }
        

        sc.close();

    }


}