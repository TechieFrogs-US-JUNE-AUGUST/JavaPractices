package Assignment.java;
import java.util.Scanner;
public class SumofNaturalif {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
        int n ,sum=0;
        System.out.print("enter value of n: ");
        n=sc.nextInt();
for(int i=1;i<=n;i++)
{
    sum=sum+i;
}
        System.out.println("sum of " +n+ " natural numbers is: " +sum);
sc.close();
    }
}
