import java.util.Scanner;

public class CodingS3other {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("give the string");
        String str = scannerObj.nextLine();  
        int[] freq = new int[str.length()];  
        char maxChar = str.charAt(0);                   
        char string[] = str.toCharArray();    //Converts given string into character array        
        //Count each word in given string and store in array freq  
        for(int i = 0; i < string.length; i++) {  
            freq[i] = 1;  
            for(int j = i+1; j < string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
                    freq[i]++;    
                    string[j] = '0';  //Set string[j] to 0 to avoid printing visited character 
                }  
            }
        }
        int max = freq[0];  
        for(int i = 0; i <freq.length; i++) {               
            if(max < freq[i]) {  
                max = freq[i];  
                maxChar = string[i];  
            }  
        }  
          System.out.println("Maximum occurring character: " + maxChar);  
        scannerObj.close();
    }  
}