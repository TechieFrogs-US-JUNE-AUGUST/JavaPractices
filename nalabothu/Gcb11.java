import java.util.Scanner;

public class Gcb11 {
    public static void main(String[] args) {
        int n1, n2;
        int gcd = 1;
        Scanner sr = new Scanner(System.in);
        System.out.println("enter n1 value");
        n1 = sr.nextInt();
        System.out.println("enter n2 value");
        n2 = sr.nextInt();
        for (int i = 1; i <= n1 && i <= n2; ++i) {
            // check if i is factor of two numbers
            if (n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }

            System.out.printf("GCD of two numbers: %d ", gcd);

        }

    }

// public class Gcb11
// {
// public static void main(String[] args)
// {
// //x and y are the numbers to find the GCF
// int x = 12, y = 8, gcd = 1;
// //running loop form 1 to the smallest of both numbers
// for(int i = 1; i <= x && i <= y; i++)
// {
// //returns true if both conditions are satisfied
// if(x%i==0 && y%i==0)
// //storing the variable i in the variable gcd
// gcd = i;
// }
// //prints the gcd
// System.out.printf("GCD of %d and %d is: %d", x, y, gcd);
// }
// }
