import java.util.Scanner;

public class CodingS1 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the string");
        String string = scannerObj.nextLine(); 
        String words[] = string.split(" ");	
        //String reversedString = ""; // empty string
	    for (int i = 0; i < words.length; i++){
           String word = words[i]; 
           String reverseWord = "";
           for (int j = word.length()-1; j >= 0; j--) {
               reverseWord = reverseWord + word.charAt(j);
               
	        }
            if(word.equalsIgnoreCase(reverseWord)){ //it ignores the uppercase letters 
                System.out.println("Word "+(i+1)+" is a palindrome" );
            }else
                System.out.println("Word"+(i+1)+" is not a palindrome");
	        //reversedString = reversedString + reverseWord + " ";
	    }
	    //System.out.println(string);
	    //System.out.println(reversedString);
        scannerObj.close();
    }        
}
