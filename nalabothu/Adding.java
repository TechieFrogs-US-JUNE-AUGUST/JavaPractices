
import java.util.Scanner;
public class Adding {

    public static void main(String[] args)
    {
        int a,b,add;
        Scanner sr=new Scanner(System.in);
        System.out.println("enter a correct value");
        a =sr.nextInt();
        System.out.println("enter b value");
        b =sr.nextInt();
        if(!sr.hasNextInt())
        {
            System.out.println("this is not a number pleas enter number");
            sr.next();
        }
        add=a+b;
        System.out.println("addition of two numbers is" +add);
    }
    
}
}

