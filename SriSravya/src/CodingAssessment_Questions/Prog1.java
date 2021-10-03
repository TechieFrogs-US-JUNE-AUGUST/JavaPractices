// Write a function which finds the words that are palindrome in a given string.
package CodingAssessment_Questions;
public class Prog1 {
    static boolean checkPalin(String word){               //method that checks if the word is palindrome
        int n= word.length();                             //assigning word length to 'n'
        word= word.toLowerCase();                         //converting the word to lower case
        for(int i=0; i<n; i++,n--){
            if(word.charAt(i) != word.charAt(n-1))
            return false;
        }
        return true;
    }
    public static int countPalin(String s) {            //method that checks the count of palindrome words
        s= s+" ";                                      //checks the last word for palindrome
        String word= " ";                              //stores each word
        int count= 0;
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(ch!= ' ')                              //extracting each word
            word= word+ch;
            else{
                if(checkPalin(word))                //control goes to checkPalin method with parameter as 'word'
                count++;
                word= " ";
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Count of palindrome words in the given string are: ");
        System.out.println(countPalin("Madam speaks Malayalam"));
    }
}
