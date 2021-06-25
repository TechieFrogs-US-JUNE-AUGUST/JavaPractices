

import java.util.Scanner;

public class ReversePyramidUsingAlphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        char ch='A';
        for(int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }
}
