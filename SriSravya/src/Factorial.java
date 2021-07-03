import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
       /* int n=5;
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial=factorial*i;{
                System.out.println("Factorial is: "+factorial);
            }
        }
    }
}   */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
            {
                System.out.println("factorial is: "+factorial);
            }
        }
    }
}
