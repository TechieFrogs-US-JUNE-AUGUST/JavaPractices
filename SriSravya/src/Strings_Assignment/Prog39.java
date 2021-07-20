package Strings_Assignment;

public class Prog39 {
    public static void main(String[] args) {
        String s="Sri Sravya";
        int freq[]= new int [s.length()];                 //frequency array to store the frequency of each character
        char String[]= s.toCharArray();                   //converting string to character array

        for(int i=0; i<s.length(); i++){
            freq[i]= 1;
            for(int j= i+1; j<s.length(); j++){
                if(String[i]==String[j]){
                    freq[i]++;
                    String[j]='0';                      //setting string[j] to 0 to avoid printing of visited character
                }
            }
        }
        System.out.println("Frequency of the characters are: ");
        for(int i=0; i<freq.length; i++){
            if(String[i]!=' ' && String[i]!='0')
            System.out.println(String[i] + "-" +freq[i]);
        }
    }
}
