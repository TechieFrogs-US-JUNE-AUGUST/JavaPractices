import java.util.Scanner;
public class Quotient2
{
    public static void main(String[] args)
    {
        int a,b,quotient,remainder;
        Scanner sr=new Scanner(System.in);
    System.out.println("enter a value");
    a=sr.nextInt();
    System.out.println("enter b value");
    b=sr.nextInt();
    quotient=a/b;
    remainder=a%b;
    System.out.println("the Quotient is"+quotient);
    System.out.println("the remainder is"+remainder);
}
}