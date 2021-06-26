import java.util.Scanner;

public class SumOfNaturalnumbers {
    public static void main(String[] args) {
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a num: ");
            int n = scan.nextInt();

            int sum = 0,i=1;
           // for (int i = 1; i <= n; i++) {
            while(i<=n){
                sum = sum + n;
                i++;
            }
            System.out.println("Sum is: " + sum);
        }
    }
}
