import java.util.Scanner;
public class FullPyramid {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("enter value of n:");
int n = sc.nextInt(); 
        int k = 0;
        for (int i = 1; i <= n; ++i,k=0) {
            for (int s = 1; s <= n - i; ++s) {
                System.out.print(" ");
            }
            while (k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }
            System.out.println();
        } sc.close();
    }
}