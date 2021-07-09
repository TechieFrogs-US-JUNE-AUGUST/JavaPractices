import java.util.Scanner;
public class Swap3
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sr=new Scanner(System.in);
        System.out.println("enter a value");
        a=sr.nextInt();
        System.out.println("enter b value");
        b=sr.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.print("after swapping"+a +b);
    }
}