//TO FIND THE LONGEST REPEATING SEQUENCE IN A STRING
package Strings_Assignment;

public class Prog28 {

    public static String lcp(String s, String t){           //here s= s1.substring(i,len) and t= s1.substring(j,len)
        int len= Math.min(s.length(), t.length());              //gives the min length i.e,either s length or t length
        for(int i=0; i<len; i++){
            if(s.charAt(i)!= t.charAt(i)){
                return s.substring(0, i);
            }
        }
        return s.substring(0, len);
    }

    public static void main(String[] args) {
        String s1="abcdefabc";
        String s2="";
        int len=s1.length();

        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                String s3= lcp(s1.substring(i, len), s1.substring(j, len));      //checking for the largest common factors in every substring
                if(s3.length()> s2.length())             //if the current prefix is > previous one, then it takes current on as longest repeating sequence
                s2= s3;
            }
        }
        System.out.println("Longest repeating sequence: " +s2);
    }
}