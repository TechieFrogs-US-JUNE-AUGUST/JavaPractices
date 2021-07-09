
import java.util.Scanner;
public class Even4 {
    public static void main(String[] args)
    {
        int a;
        System.out.println("enter a value");
        Scanner sr=new Scanner(System.in);
        if(!sr.hasNextInt())
        {
            System.out.println("this is not a number pleas enter number");
            sr.next();
        }
            a=sr.nextInt();
        
        if(a%2==0)
        {
            System.out.println(+a +"is even number");
        }
        if(a%2==1)
        {
            System.out.println(+a +"is odd number");
        }
    sr.close();    
    }
    }


