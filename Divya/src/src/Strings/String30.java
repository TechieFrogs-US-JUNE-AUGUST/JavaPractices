package Strings;

public class String30 {
    public static void main(String[] args) {
        String str = "my name is divya";
        System.out.println("first sentence: " + str);

        str = str.replaceAll("\\s", "");      //method to remove white spaces
        System.out.println("after clear white spaces : " + str);
    }
}