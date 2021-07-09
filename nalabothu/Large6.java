package assignment1;
import java.util.Scanner;
public class Large6 {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sr=new Scanner(System.in);
        System.out.println("enter a value");
        a=sr.nextInt();
        System.out.println("enter b value");
        b=sr.nextInt();
        System.out.println("enter c value");
        c=sr.nextInt();
        if((a > b )&& (a>c))
        {
            System.out.println(" a is big");
        }
        else if((b > a )&&(b>c))
        {
            System.out.println(" b is big");
        }
        else
        {
            System.out.println(" c is big");
        }
    }
    
}
