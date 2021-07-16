package Strings_Assignment;

public class Prog7 {
    public static void main(String[] args) {
        String s1=new String("Sri");
        String s2=new String("Sri");

        if(s1==s2)                       //address is in heap so o/p will be Not Equal even if string values are same
        System.out.println("Equal"); 
        else
        System.out.println("Not Equal");
    }
}
