import java.util.Scanner;
public class RightPascalTriangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       int n;                            // no of rows to print.
        System.out.print("enter value of n:");
        if(!sc.hasNextInt())
        {
            System.out.println("n is not a number, please enter a number");
            sc.next();
        }
        n=sc.nextInt();
        if(n<=0)
    {
        System.out.println("n is a number "+n );
    }
        else
        {
            System.out.println("entered n value is: " +n);
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print('*');
        }
            System.out.println();
        }sc.close();
        System.out.println("out of loops");
    }
}