import java.util.Scanner;
public class HalfPyramidUsingAlphabets 
{
public static void main(String[] args)
{
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of lines to be printed");
    n=sc.nextInt();
    char ch='A';

    for(int i=1;i<=n;++i)
    {
        for(int j=1;j<=i;++j)
        {
            System.out.print(ch +"");
        }
        ch++;
        System.out.println();
    }
}
    
}
