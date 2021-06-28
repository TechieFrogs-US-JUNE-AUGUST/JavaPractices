import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args){
        int n,remainder,c,sum=0,temp;
        Scanner s=new Scanner(System.in);
        System.out.println("enter n value");
        n=s.nextInt();
        temp=n;
        while(n>0){
        remainder=n%10;
        c=remainder*remainder*remainder;
        sum=sum+c;
        n=n/10;}
        if(sum==temp){
            System.out.println("enter number is an Armstrong number");
        }
        else{
            System.out.println("enter number is not an Armstrong number");
            s.close();
    }
    }
}
