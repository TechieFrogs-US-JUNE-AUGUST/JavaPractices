import java.util.Scanner;
public class NaturalSumWhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,sum=0;
        System.out.print("enter value of n: ");
        n=sc.nextInt();
        int i=0;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("sum of " +n+ " natural numbers is: " +sum);
        sc.close();
    }
    }