
import java.util.Scanner;
public class FullPyramid {
    public static void main(String[] args) {
        int n, i, j, k = 0;
        System.out.println("enter n value");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (i = 1; i <= n; ++i,k=0) {
            for (j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }
            while (k != 2 * i - 1) {
                System.out.print(" *");
                ++k;
            }
            System.out.print("\n");
            s.close();
        }
    }
}