import java.util.Scanner;
public class NumberFullPyramid {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of lines to be printed");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=(n-i)*2;j++)
            {
                System.out.print(" ");
            }
            for(int k=2;k<=i;k++)
            {
                System.out.print(" "+(k+i-2));
            }
            for (int l=i;l>=1;l--)
            {
                System.out.print(" "+(l+i-1));
            }
            System.out.println();
        } sc.close();
    }
}