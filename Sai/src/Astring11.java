import java.util.Random;
public class Astring11{
  public static void main(String[] args) {

    // create a string of uppercase and lowercase characters and numbers
    String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
    String numbers = "0123456789";
    String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;// combining all the strings
    StringBuilder sb = new StringBuilder(); // cretaing random string builder
    Random random = new Random();  //Creating an object of Random class
    int length = 10; // assigning the length of the random string
    for(int i = 0; i < length; i++) {
        int index = random.nextInt(alphaNumeric.length());  // generate random index number
        char randomChar = alphaNumeric.charAt(index);// get character specified by index from the string
        sb.append(randomChar);  // appending the char to string builder
    }
    String randomString = sb.toString();
    System.out.println("Random String is: " + randomString);
  }
}
