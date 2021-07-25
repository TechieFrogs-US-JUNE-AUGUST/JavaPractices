public class String13 
{
    public static void main(String[] args) 
    {
        StringBuffer str = new StringBuffer("Strings Assignment"); 
        System.out.println(str.length());                                            // Length of the String is 18 including space
        str.setLength(2);                                                           // By using setLength we can print only the indexes given in the length.
        System.out.println("String Buffer : " +str);                               
        System.out.println(str.length());                                         // Length of the string is 2
    }
    
}