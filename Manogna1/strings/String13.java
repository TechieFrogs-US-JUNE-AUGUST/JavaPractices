package strings;

public class String13 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Strings Assignment"); 
        System.out.println(str.length()); // Length of the String is 18
        str.setLength(0);  // By using setLength we changed the Length to 0
        System.out.println("String Buffer : " +str);  // Length of the string is 0
    }
    
}
