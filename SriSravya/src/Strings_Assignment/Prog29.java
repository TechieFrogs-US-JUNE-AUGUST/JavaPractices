//TO FIND ALL PERMUTATIONS OF A STRING
package Strings_Assignment;

public class Prog29 {

    public static void main(String[] args) {
        permutation("ABC");                      //calling method with passing i/p value
    }
    public static void permutation(String input){      //method with single argument
        permutation("",input);                        //calling method with 2 arguments
    }
    private static void permutation(String perm, String word){        //method with 2 arguments
       if(word.isEmpty()) {                                         //if word is empty then it prints perm+word
           System.out.println(perm + word);
       } else{
           for(int i=0; i<word.length(); i++){
               permutation(perm + word.charAt(i) , word.substring(0, i) + word.substring(i+1, word.length()));  //recursive call       
           }
       }
    }
}