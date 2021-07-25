import java.util.Random;
public class Astring10{
    public static void main(String[] args){
      String alphabet = "ABCDEFGacadc";
      StringBuilder sb = new StringBuilder();  // creating random string builder

    
    Random random = new Random();  // creating an object of Random class
    int length = 7;   //assigning the length to a Random String
    for(int i = 0; i < length; i++) {
        int index = random.nextInt(alphabet.length());// generate index for random
        char randomChar = alphabet.charAt(index);// getting characters by index location
        sb.append(randomChar); // appending back to the string
    } 
    String randomString = sb.toString();
    System.out.println("Random String is: " + randomString);
    } 
}
