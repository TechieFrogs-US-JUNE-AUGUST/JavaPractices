package Strings_Assignment;

public class Prog38 {
   public static void main(String[] args) {
       String s="Sri Sravya Sri Sai Sri";
       int count= 0;

       s=s.toLowerCase();                         //converting string to lower case
       String words[]= s.split(" ");              //splitting the string into words using split
       System.out.println("Duplicate words in the given string are: ");
       for(int i=0; i<words.length; i++){
           count= 1;
           for(int j= i+1; j<words.length; j++){
               if(words[i].equals(words[j])){     //checking if words[i] is equal to words[j]
                   count++;
                   words[j]= "0";                //setting words[j] to 0 to avoid printing visited word
               }
           }
           if(count>1 && words[i]!="0")          //displaying the duplicate word if count>1
           System.out.println(words[i]);
       }
   } 
}
