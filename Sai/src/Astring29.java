import java.util.Scanner;

public class Astring29 {
    static void printPermutations(String str, String ans){  
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            // Rest of the string after excluding the ith character
            String ros = str.substring(0, index) + str.substring(index + 1);
            printPermutations(ros, ans + ch); //// Recurvise call
        }
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Give the string : ");
        String s = obj.nextLine();
        printPermutations(s, ""); //calling method
        obj.close();
    }
}
