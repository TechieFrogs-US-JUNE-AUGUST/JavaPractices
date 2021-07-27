import java.util.Scanner;
public class Astring40 {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Give the string");
        String inputString=Obj.nextLine();
        String stringArray[]= inputString.split("[ .,]");//splitting the words and ignoring "space",",","."
        String largeString= stringArray[0];
        String smallString= stringArray[0];

        for(int i=0; i<stringArray.length; i++) {
            if(largeString.length()<stringArray[i].length())  //checking for the largest word
                largeString =stringArray[i];
                if(smallString.length()>stringArray[i].length()) //checking for the smallest word
                smallString= stringArray[i];        
        }
        System.out.println("Largest Word : "+ largeString +",  Smallest Word : "+smallString);
        Obj.close();
    }
}
