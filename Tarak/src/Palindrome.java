

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string ");
        String s=sc.next();
        int i=0;
        int j=s.length()-1;
        for (i=0;i<j;i++){
                if (s.charAt(i)==s.charAt(j)){
                    System.out.println(s+" is a palindrome ");
                }
                else System.out.println(s+" is not a palindrome");
                break;
        }

    }
}
