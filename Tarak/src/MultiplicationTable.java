

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            int m=n*i;
            System.out.println(i+ "*" +n+ "=" +m);
        }

    }
}
