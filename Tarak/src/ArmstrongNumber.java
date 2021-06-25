
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter positive number ");
        int n=sc.nextInt();
        int x=n;
        int r=1;
        int sum=0;
        while (n!=0){
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==x)
        {
            System.out.println("it is an Armstrong number");
        }
        else{
            System.out.println("it is not an Armstrong number");
        }

    }
}
