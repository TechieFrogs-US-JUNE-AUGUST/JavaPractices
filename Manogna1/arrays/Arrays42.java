package arrays;

import java.util.Arrays;

public class Arrays42 {
    public static void main(String[] args) {
        char ch[]={'a','r','r','a','y','s'};
        String string=String.valueOf(ch); //we use string.valueof() method to convert char array to string
        String string1=new String(ch);//it takes the character array as parameter for conversion
        System.out.println(string);
        System.out.println(string1);

        String str="Arrays Assignment";
        char ch1[]=str.toCharArray();//used to convert string to array of characters
        System.out.println(Arrays.toString(ch1));
    }
    
}
