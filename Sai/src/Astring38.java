import java.util.Scanner; 
public class Astring38{
    public static void main(String[] args){
        Scanner duplicateString = new Scanner(System.in);
        System.out.println("Give the input String : ");
        String inputString = duplicateString.nextLine();
        inputString = inputString.toLowerCase();// converting all letters intlo lowercase
        String[] words = inputString.split("[ ,.]");//for splitting more than 1,create an array
        int length = words.length;             //.split makes string into tokens with given array objects
        for(int i = 0; i<length; i++){
            int count = 1; 
            for(int j = i+1; j<length; j++){
                if(words[i].equals(words[j])){// checking for the duplicates
                    count++;   // getting number of duplicated words
                    words[j]="0"; // making 0 to check the new word
                }
            }
            if (words[i] != "0" && count > 1)// if both satisfies, duplicates are there
            System.out.print(" "+words[i]+" ");
        }
        duplicateString.close();
    }
}