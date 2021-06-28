import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        int rem, b,result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of a:");
       int a = sc.nextInt();     //a is number to check if it is armstrong or not.
       b=a;
        while (b != 0) {
            rem = b % 10;
                                           //System.out.print(rem +" is the reminder");
            result =result+(rem * rem * rem);
                                            //result =result + result;
                                                //System.out.println(" "+result+" is the result");
           b =b/ 10;
                                                 //System.out.println(b+ " are the remaining digits");
        }
        if (a==result) {
            System.out.println(a + " is an armstrong number");
        } else
            System.out.println(a + " is not an armstrong number");
        sc.close();
    }
}