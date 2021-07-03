                    // least common factor by using for loop
import java.util.Scanner;
public class LCM {
    public static void main(String[] args){
        int n1,n2,gcd=1,lcm;
        System.out.println("enter n1 and n2 values");
        Scanner s=new Scanner(System.in);
        n1=s.nextInt();
        n2=s.nextInt();
        for(int i=1;i<=n1&&i<=n2;i++){
            if(n1 % i==0 && n2 % i==0)
           gcd=i;}
           lcm=(n1*n2)/gcd;
System.out.println("Lcm of "+n1+"and"+n2+"is"+lcm);
s.close();
    }
}
