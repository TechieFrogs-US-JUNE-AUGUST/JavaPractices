import java.util.Scanner;
public class HalfPyramidUsingNumbers 
{
public static void main(String[] args)
{
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n value");
    n=sc.nextInt();
    for(int i=0;i<=n;++i)
    {
        for(int j=0;j<=i;++j)
        {
            System.out.print(j +"");
        }
        System.out.println();
    }
}
    
}
