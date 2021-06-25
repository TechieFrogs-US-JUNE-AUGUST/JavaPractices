

import java.util.Scanner;

public class MultiTableUsingWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int i=1;
        int n=sc.nextInt();
        while ( i<=10){
            int m=n*i;
            System.out.println(n+ "*" +i+ "=" +m);
            i++;
        }

    }
}
