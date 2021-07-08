                             // find GCD between n1 and n2
import java.util.Scanner;
public class GcdOfTwoNumbers{
    public static void main(String[] args) {
        int n1,n2;
        System.out.println("enter any two numbers");
        Scanner s=new Scanner(System.in);
        n1=s.nextInt();
        n2=s.nextInt();
        // initially set to gcd
        int gcd=1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0)          // check if i perfectly divides both n1 and n2
                gcd = i;
        }
        System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
        s.close();
    }
}
                //by using while loop
   /* while(n1!=n2){
    if(n1>n2)
    n1-=n2;
    else
        n2-=n1;}
    System.out.println("Gcd of given numbers is:"+n2);
    }
    }*/