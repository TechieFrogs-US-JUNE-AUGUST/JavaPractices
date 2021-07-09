

import java.util.Scanner;

public class LcmUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a and b ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int lcm=a>b?a:b;
        while (true){
            if(lcm%a==0 && lcm%b==0){
                break;
            }
            lcm++;
        }
        System.out.println("lcm is "+lcm);
    }
}
