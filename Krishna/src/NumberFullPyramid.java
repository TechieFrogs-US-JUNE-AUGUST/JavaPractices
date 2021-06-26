package Assignment.java;
import java.util.Scanner;
public class NumberFullPyramid {
    public static void main(String[] args) {
         //int l;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of lines to be printed");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=(n-i)*2;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(" "+(k+i-1));
                k++;
            }
            for (int l=i;l>=1;l--)
            {
                System.out.print(" "+(l+i-1));

            }
            System.out.println();
        }
    }
}
       /* int i, l, k;
        for (i = 1; i <= 5; i++) {
            for (int j = 1; j <= (5 - i) * 2; j++) {
                System.out.println(" ");
            }
        }
        for (l = 1; l <= i; l++) {
            System.out.println(" " + (l + i - 1));
        }
        for (k = i; k >= 1; k--) {
            System.out.println(" " + (k + i - 1));
        }
        System.out.println();
    }
}*/