import java.util.Scanner;
public class HalfPyramid17 
{
    public static void main(String[] args)
    {
       int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value"); //entering n value
        n=sc.nextInt();
        for(int i=1;i<=n;++i)
        {
            for(int j=1;j<=i;++j)
            {
                System.out.print("*");
            }
            System.out.println();
            }
        }


    }
    

