import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter natural num");
        int sum=0;
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum of n natural numbers= " +sum);
        sc.close();
    }

    }

