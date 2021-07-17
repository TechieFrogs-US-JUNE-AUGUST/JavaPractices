package StringsAssignment;

import java.util.Scanner;

public class StringsAssignment6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two strings");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String str3=new String("Tarak");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
    }
}
