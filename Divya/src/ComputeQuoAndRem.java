                   // To compute Quotient and remainder
import java.util.Scanner;
                   public class ComputeQuoAndRem {
    public static void main(String[] args){
        int a,b,c,d,e;
        System.out.println("enter a and b values");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=a/b;      // to find quotient
        d=a%b;      // to find remainder
        e=c+d;      // to compute quotient and remainder
        System.out.println("After computing of quotient and remainder="+e);
        s.close();
    }
}
