import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First value");
        int num1=sc.nextInt();
        System.out.println("Enter Second value");
        int num2=sc.nextInt();
        while(num1!=num2) {
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }

       System.out.println("GCD of Given Number is :"+num2);
       sc.close();
    }
}
