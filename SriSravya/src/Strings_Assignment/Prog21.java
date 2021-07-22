//IF A STRING IS VALID SHUFFLE OF TWO STRINGS
package Strings_Assignment;
import java.util.Arrays;

public class Prog21 {
    //length of the string should be equal to sum of strings
    static boolean checkLength(String s1, String s2, String result){
        if(s1.length() + s2.length()!= result.length()){
            return false;
        }
        else{
            return true;
        }
    }

    //this method converts the string to char array
    static String sortString(String str){
        char charArray[]= str.toCharArray();
        Arrays.sort(charArray);                   //sorts the char array
        str= String.valueOf(charArray);           //converts the char array to string and return it
        return str;
    }

    //this method compares each character of the result with individual characters of s1 and s2
    static boolean shuffleCheck(String s1, String s2, String result){
        s1= sortString(s1);                       //sorting the string
        s2= sortString(s2);
        result= sortString(result);        

        int i=0, j=0, k=0;
        while(k!= result.length()){              //iterate through all characters of result
            if(i< s1.length() && s1.charAt(i) == result.charAt(k))        //checking if first char of result matches with first char of first string
            i++;
            else if(j< s2.length() && s2.charAt(j) == result.charAt(k))  //checking if first char of result matches with first char of second string
            j++;
            else{                                      //if the char doesn't match
                return false;
            }
            k++;
        }

        if(i<s1.length() || j<s2.length()){         //after accessing all chars of result..if either s1 or s2 has some chars left
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1= "XY";
        String s2= "12";
        String results[]= {"1XY2", "Y1X2", "Y21XX"};
        for(String result: results){                             //for-each loop
            //calling method to check if result string is shuffle of string s1 and s2
           if(checkLength(s1,s2,result) == true && shuffleCheck(s1,s2,result) == true){            
               System.out.println(result + " is a valid shuffle");
           } else{
               System.out.println(result + " is not a valid shuffle");
           }
        }
    }
}
