//TO CHECK IF A STRING CONTAINS SUBSTRING USING CONTAINS()
package Strings_Assignment;

public class Prog19 {
    public static void main(String[] args) {
        String s="This is Sravya";
        String s1="Sri";
        String s2="Sravya";

        boolean result= s.contains(s1);                              //using contains(), s should contain characters of s1
        if(result){
            System.out.println(s1 + " is present in the string");
        } else{
            System.out.println(s1 + " is not present in the string");
        }

        result= s.contains(s2);
        if(result){
            System.out.println(s2 + " is present in the string");
        } else{
            System.out.println(s2 + " is not present in the string");
        }
    }
}
