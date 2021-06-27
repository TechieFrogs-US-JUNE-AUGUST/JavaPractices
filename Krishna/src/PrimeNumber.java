import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int r;                          // r is the range of numbers.
        int i,j;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter r value ");
        r= sc.nextInt();
        for(i=2;i<=r;i++)                 // i=2 is given since prime numbers start from 2
        {
            int fact = 0;
            for (j =2; j <i; j++)
            {
                if (i % j == 0)
                {
                    fact++;
                }
            }
            if(fact==0)
                System.out.println("prime numbers are:" +i);
                 }
        sc.close();
            }
        }