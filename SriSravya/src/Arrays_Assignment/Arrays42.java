//TO CONVERT CHAR ARRAY TO STRING    AND     STRING TO CHAR ARRAY
package Arrays_Assignment;

import java.util.Arrays;

public class Arrays42 {
    public static void main(String[] args) {
        //char array to string
        char charArray[]= {'s','r','a','v','y','a'};
        String str= new String(charArray);                 //using the obj reference with passing array as argument
        System.out.println(str);

        //string to char array
        String str1= "Sravya";
        char charArray1[]= str1.toCharArray();             //toCharArray converts string to char
        System.out.println(Arrays.toString(charArray1));   //to print the char array we use Arrays.toString
    }
}
