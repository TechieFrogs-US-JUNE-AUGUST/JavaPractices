import java.util.Scanner;

public class Coding16 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Give String 1 : ");
        String string1 = scannerObj.next();
        System.out.print("Give String 2 : ");
        String string2 = scannerObj.next();
        System.out.print("Give String 3 : ");
        String string3 = scannerObj.next();
        string1 = string1.replaceAll("[aeiou]", "%"); // replacing all vowels to %
        string2 = string2.replaceFirst("[a-z]", "#"); // replacing all consonants to #
        string3 = string3.toUpperCase(); //convert entrire string to UpperCase
        System.out.println(string1+" "+string2+" "+string3);
        scannerObj.close();
    }
}
