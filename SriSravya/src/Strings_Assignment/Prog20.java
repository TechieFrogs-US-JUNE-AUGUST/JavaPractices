package Strings_Assignment;

public class Prog20 {
    public static void main(String[] args) {
        String s="This is Sravya";
        String s1="Sri";
        String s2="Sravya";

        int result= s.indexOf(s1);                              //using indexOf()
        if(result== -1){                                       //string sri doesn't match string s and index value is -1
            System.out.println(s1 + " is not present in the string");
        } else{
            System.out.println(s1 + " is present in the string");
        }

        result= s.indexOf(s2);                                    //index value of Sravya starts at 8, so result=8
        if(result== -1){
            System.out.println(s2 + " is not present in the string");
        } else{
            System.out.println(s2 + " is present in the string");
        }
    }
}
