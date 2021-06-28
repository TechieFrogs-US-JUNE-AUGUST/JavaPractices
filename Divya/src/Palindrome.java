import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int n, temp, reverse=1,remainder;
        System.out.println("enter n value");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        temp=n;
        while(n!=0){
            n=n/10;
            remainder=n%10;
            reverse=reverse*n+remainder;}
            if(reverse==temp){
                System.out.println("enter number is palindrome");
            }
            else{
           System.out.println("enter number is not a palindrome");
        }
        s.close();
    }
}