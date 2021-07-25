

public class String6 
{
    public static void main(String[] args) 
    {
        String str1 = "rama";
        String str2 = "krishna";
        String str3 = "Rama";
        System.out.println(str1.equals(str2));  
        System.out.println(str1.equals(str3));              //false both strings are not same.
        System.out.println(str1.equalsIgnoreCase(str3));    //true  both strings are same since case is ignored. 
    }
}