package StringsAssignment;

import java.util.Scanner;

public class StringsAssignment5and7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two strings");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String str4="tarak";
        String str5="tarak";
        String str3=new String("Tarak");
        String str6=new String("Tarak");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str4==str5);
        System.out.println(str3==str6);
    }
}
