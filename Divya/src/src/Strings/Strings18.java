public class Strings18 {
    public static void main(String args[]){
    String name= "divya";                                        // declare and initialize string variable
    System.out.println("characters in a given string are:");
      //  for(int i = 0; i<name.length(); i++) {
     //   }
            for (char ch: name.toCharArray()) {                 // to convert string to char array
                System.out.print(ch+ " ");
            }

}
}
