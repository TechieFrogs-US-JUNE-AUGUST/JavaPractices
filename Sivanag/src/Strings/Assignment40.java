//Find Largest and Smallest Word in a String
package Strings;
public class Assignment40 {
    public static void main(String[] args) {
        String string1="afd afsd afd afd fadsffdfaf afsd fadsf afsd a";
        System.out.println("Given String");
        String string2[]=string1.split(" ");                            //Separate words in to array
        String stringL=string2[0];
        String stringS=string2[0];
        for(int j=0;j<string2.length;j++) {
            
                if(stringL.length()<string2[j].length())                //if condition to check for Largest word
                stringL=string2[j];
                if(stringS.length()>string2[j].length())                //if condition to check for Smallest word
                stringS=string2[j];        
        }
        System.out.println("Largest Word in a string is " + stringL);
        System.out.println("Smallest Word in a string is " + stringS);
    }
    
}
