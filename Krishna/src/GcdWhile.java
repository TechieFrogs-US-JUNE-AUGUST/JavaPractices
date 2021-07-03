 import java.util.Scanner;
public class GcdWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n1,n2 values");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        while(n1!=n2)
        {
            if (n1>n2) {
                n1= n1-n2;
            }
            else
            {
                n2=n2-n1;      // sout should be given either inside the if loop or outside of the while loop
            }
        }
        System.out.println("Gcd of n1,n2 is "+n2);
        sc.close();
    }
}