import java.util.Scanner;

public class CodingS3 {
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Give the String : ");
        String string = scannerObj.nextLine();
        System.out.println("Max occurring character is " + maximumOccur(string));
        scannerObj.close();
    }
    //static final int ASCII_SIZE = 256;
    static char maximumOccur(String string){
        // Create array to keep the count of individual characters and initialize the array as 0
        int count[] = new int[256];      
        // Construct character count array from the input string.
        for (int i=0; i < string.length(); i++)
            count[string.charAt(i)]++;      
        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result      
        // Traversing through the string and maintaining the count of each character
        for (int i = 0; i < string.length(); i++) {
            if (max < count[string.charAt(i)]) {
                max = count[string.charAt(i)];
                result = string.charAt(i);
            }
        }      
        return result;
    }    
}