import java.util.Scanner;
public class Astring39 {
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter sentence"); 
        String string = scannerObj.nextLine();// getting the string
        System.out.println("Enter the character you want to check");
        char ch = scannerObj.next().charAt(0);// give the letter we need to check the frequency
        int frequency = 0;
        for(int index = 0; index < string.length(); index++){//checking every location for total string length
            if(ch == string.charAt(index))//checking each character with the character we want frquency
                ++frequency;
        }
        System.out.println("Frequency of " + ch + " = " + frequency);
        scannerObj.close();
    }
}
