import java.util.Scanner;
public class Multiplication11 
{
    public static void main(String[] args)
     {
    int n;
    Scanner sr=new Scanner(System.in);
    System.out.println("enter n value");
    n=sr.nextInt();
      for(int i = 1; i <= 10; ++i)
            {
                System.out.printf("%d * %d = %d \n", n, i ,(n*i));
                System.out.println( n+ " * "+i +"="+ n*i);
            }
        }
    }