package strings;

public class String12 {
    public static void main(String[] args) {

        StringBuffer str=new StringBuffer("Strings");
        str.append(" Assignment");      //Adds string to string Buffer
        System.out.println("StringBuffer : " +str); 
        //str.delete(0, 3);
       // System.out.println("StringBuffer : " +str);
        System.out.println(str.length());  //Length of the String
        str.delete(0,str.length());   // clears the String using Delete
        System.out.println("String Buffer : " +str);
        
    }
    
}
