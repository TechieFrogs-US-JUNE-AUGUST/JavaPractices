

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        do {
            System.out.println("enter range from 2 to find prime num in given range: ");
            while (!sc.hasNextInt())
            {
                System.out.println("This is not a number. Please enter number");
                sc.next();
            }
            n=sc.nextInt();
        }while (n<=1);
        for(int i=2;i<=n;i++){
            int factor=0;
            for (int j=1;j<=i;j++){
                if(i%j==0){
                    factor=factor+1;
                }
            }
            if (factor==2){
                System.out.print(i+ " ");
            }
        }
        System.out.println("are prime numbers");
    }
}
