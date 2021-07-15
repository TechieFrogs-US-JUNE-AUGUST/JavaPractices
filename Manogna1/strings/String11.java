package strings;

import java.util.Random;

public class String11 {
    public static void main(String[] args) {
        String upperString="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerString="abcdefghijklmnopqrstuvwxyz";
        String numString="0123456789";
        String alphaNumeric=upperString+lowerString+numString;
        StringBuilder sb=new StringBuilder();
        Random random=new Random();
        int length = 15;
        for (int i=0;i<length;i++)
        {
            int index=random.nextInt(alphaNumeric.length()); //Random index number Generation
            char randomChar=alphaNumeric.charAt(index); //get character specified by indexfrom  str
            sb.append(randomChar);//Append character to StringBuilder
        }

        
        System.out.println("Random AphaNumeric : " +sb.toString());//Every time we run the program we get diff o/p
    }
    
}
