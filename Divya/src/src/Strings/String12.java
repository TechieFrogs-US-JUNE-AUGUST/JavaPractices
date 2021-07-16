package Strings;
public class String12 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();           // create a string buffer
        s1.append("this");                             //// add string to string buffer
        s1.append(" is");
        s1.append("laptop");
        System.out.println("StringBuffer: " + s1);
        s1.delete(0, s1.length());                                      // clear the string   // using delete()
        System.out.println("Updated StringBuffer: " + s1);
    }
}

