public class RandomString {
    public static void main(String[] args) {

        // create a string of all characters
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
        // create random string builder
        StringBuilder sb = new StringBuilder();
    
        // create an object of Random class
        RandomString random = new RandomString();
    
        // specify length of random string
        int length = 7;
    
        for(int i = 0; i < length; i++) {
    
          // generate random index number
          int index = randomString.nextInt(alphabet.length());
    
          // get character specified by index
          // from the string
          char randomChar = alphabet.charAt(index);
    
          // append the character to string builder
          sb.append(randomChar);
        }
    
        String randomString = sb.toString();
        System.out.println("Random String is: " + randomString);
    
      }
}
