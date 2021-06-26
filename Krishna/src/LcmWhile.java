
import java.util.Scanner;
public class LcmWhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a,b values");
    int a= sc.nextInt();
    int b=sc.nextInt();
    int lcm=a>b?a:b;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            ++lcm;
        }
        System.out.println("lcm of a,b is " +lcm);
        sc.close();
        }
    }
