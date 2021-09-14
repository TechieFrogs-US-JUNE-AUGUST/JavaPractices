package Arrays;

import java.util.Arrays;

public class Arrays42ConvertCharacterToString 
{
    public static void main(String[] args)
    {
        char charArray[]= {'h','a','n','s','h','u'};
        String string= new String(charArray);   //using the obj reference with passing array as argument
        System.out.println(string);

        String string1= "hanshu";
        char charArray1[]= string1.toCharArray();   //method  converts string to char
        System.out.println(Arrays.toString(charArray1));   //to print the char array we use Arrays.toString
    
    }
    
}
