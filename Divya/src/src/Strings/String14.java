package Strings;

public class String14 {
    public static void main(String[] args) {
        StringBuffer strBuff = new StringBuffer();           // create a string buffer
        strBuff.append("this");                                 // add string to string buffer
        strBuff.append(" is");
        strBuff.append(" java program.");
        System.out.println("StringBuffer: " + strBuff);
        strBuff = new StringBuffer();               // clear string buffer by using new object
        System.out.println("Updated StringBuffer: " + strBuff);
    }
}

