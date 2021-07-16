package strings;

public class String44 {
    public static void main(String[] args) {
        String str1="Strings";
        String str2="Assignment";
        System.out.println("Strings Befor Swaping : " +str1 +" " +str2);
        str1=str1+str2; // concatenate both strings and store the value in str1
        str2=str1.substring(0, (str1.length()-str2.length())); //extract value of str2 from updated str1
        System.out.println("String 2 " +str2);
        str1=str1.substring(str2.length()); //extract value of str1 from updated str1
        System.out.println("String 1 " +str1);
        System.out.println("String after Swapping : " +str1 + " " +str2);
    }
    
}