package src.Coding_Assignment;
import java.util.Scanner;
public class Assignment9 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num=scannerObj.nextInt();
        System.out.println("Non Zero ddigit of Factorial of given number is : " +fact(num));
        scannerObj.close();

    }
    static int fact(int num)
    {
        if(num>9)
        {
            if((num/10)%2!=0)
            return lastNonzero(4*fact(num/5)*fact(num%10));
            else
            return lastNonzero(6*fact(num/5)*fact(num%10));
        }else
        {
            int n1=1;
        for(int i=num;i>0;i--)
        {
            n1=n1*i;
        }
        return n1;
        }
    }
    static int lastNonzero(int num)
    {
        while(num%10==0)
        {
            num=num/10;
        }
        return num%10;

    }
    
}
