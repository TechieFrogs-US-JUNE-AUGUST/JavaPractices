public class Astring17{
  public static void main(String[] args) {
    String name = "Saisree";
    System.out.println("Characters in " + name + " are:");
    for(int i = 0; i<name.length(); i++) { // this taking each and every character of the string
      char a = name.charAt(i);
      System.out.print(a + ", ");
    }
  }
}