

import java.util.Scanner;

public class SumOfNaturalUsingWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter natural num");
        int sum=0;
        int i=1;
        int n=sc.nextInt();
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("sum of n natural numbers= " +sum);
    }
}
