import java.util.Scanner;
public class Adding {
public static void main(String[] args)
    {
        int a,b,add;
        Scanner sr=new Scanner(System.in);
        System.out.println("enter a value");
        a =sr.nextInt();
        System.out.println("enter b value");
        b =sr.nextInt();
        add=a+b;
        System.out.println("addition of two numbers is" + add);
        sr.close();
    
    
}
}

