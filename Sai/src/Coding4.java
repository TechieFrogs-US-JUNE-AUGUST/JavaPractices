import java.util.Scanner;

public class Coding4 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Give the input Text : ");
        String text = str.nextLine();
        int shift = 1;
        char shiftString[] = new char[text.length()];
        for(int i = 0; i < shiftString.length; i++) {
            if(shiftString[i] == ' '){
                shiftString[i] = text.charAt(i);                
            }else
                shiftString[i] = (char) (text.charAt(i) + shift);                
        }
        System.out.println(shiftString);
        str.close();
    }
}
