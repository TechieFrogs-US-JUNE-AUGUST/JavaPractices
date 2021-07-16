package Strings;

public class Assignment14 {

public static void main(String[] args) {
    StringBuffer stb = new StringBuffer("Hi Every one ");
    stb.append("Good Morning");
    System.out.println("Before Creating new empty object :" +stb);
    stb= new StringBuffer();
    System.out.println("After Creating new empty object :" +stb);

}
    
}
