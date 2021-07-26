import java.util.Scanner;
public class Astring34{
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Give the 1st String");
        String string1 = inputScanner.nextLine();
        System.out.println("Give the 2nd String");
        String string2 = inputScanner.nextLine();
        if(string1.length() == string2.length()){// if both the lengths are equal only we get rotation
        //if we add 1st string 2 times, we will get 2nd string sequence in that added string
            if((string1+string1).indexOf(string2) != -1)// checking the string2 in added string
                System.out.println(string2+" is a rotation of "+string1);
        else
            System.out.println(string2+" is not a rotation of " + string1);
        }
        inputScanner.close();
    } 
    
}
