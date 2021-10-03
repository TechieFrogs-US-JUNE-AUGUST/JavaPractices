import java.util.Scanner;

public class String1stLetter {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Give the sentence");
        String str = scannerObj.nextLine();
        //char ch[] = str.toCharArray();
        String splitString[] = str.split(" ");
        for(int i = 0; i <= splitString.length ; i++ ){
            String convertString = (Character.toString(splitString[i].charAt(0)));
            String string = splitString[i].substring(1);
            System.out.println(convertString);
            System.out.println(string);
        }
        scannerObj.close();
    }
}
