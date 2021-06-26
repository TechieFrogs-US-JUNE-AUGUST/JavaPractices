package Assignment.java;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n ,i;
        System.out.print("Enter the number n=" ) ;
    n=sc.nextInt();
    for(i=1;i<=n;i++) {
        int m = n * i;
        System.out.println(i+ " * " +n+ "= " +m );
        //System.out.println(m+ "=" +n+ "*" +i);
    }
    }
}