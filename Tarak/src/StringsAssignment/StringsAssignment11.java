package StringsAssignment;

import java.util.Random;

public class StringsAssignment11 {
    public static void main(String[] args) {
        String upperCaseString="Tarak";
        String lowerCaseString="ram";
        String numString="0477";
        String alphaNumeric=upperCaseString+lowerCaseString+numString;
        StringBuilder strbul=new StringBuilder();
        Random r=new Random();
        int length = 15;
        for (int i=0;i<length;i++)
        {
            int index=r.nextInt(alphaNumeric.length()); // Random index Generation
            char randomChar=alphaNumeric.charAt(index); // get character specified by index from  string
            strbul.append(randomChar);    //Appending character to StringBuilder
        }

        
        System.out.println("Random AphaNumeric : " +strbul.toString());  //we get different output every time
    }
}
