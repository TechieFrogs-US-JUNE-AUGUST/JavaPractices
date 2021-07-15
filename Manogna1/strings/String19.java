package strings;

public class String19 { // to check str1 and str2 are present in str
    public static void main(String[] args) {
        String str="Strings Assignment";
        String str1="Strings";
        String str2="Program 19";
        boolean result=str.contains(str1); // check the name present in the string using contains
       System.out.println("Result " +result); // true
        if(result) //  true
        {
            System.out.println(str1 + " is Present in the String");// it will execute
        }
        else
        {
            System.out.println(str1 + " is not in the String");
        }
        result=str.contains(str2); //check the name present in the string using contains
        System.out.println("Result " +result); //false
        if(result) //false
        {
            System.out.println(str2 + " is Present in the String");
        }
        else
        {
            System.out.println(str2 + " is not in the String");//It will execute
        }
        
    }
    
}
