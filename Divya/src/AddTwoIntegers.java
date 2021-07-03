                  //Addition of two integers
import java.util.Scanner;
                  public class AddTwoIntegers {
    public static void main(String[] args){
        int a,b,c;
        System.out.println("enter a and b values");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
        System.out.println("Addition of two integers ="+c);
        s.close();
    }
}
