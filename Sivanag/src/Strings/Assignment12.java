//Clear String Buffer
package Strings;
public class Assignment12 {
    public static void main(String[] args) {
        StringBuffer stb =new StringBuffer("Hello every one");
        stb.append("Good Evening");
        stb.setLength(0);
        System.out.println("String after Set String Buffer Length is 0 :" +stb);

    }

    
}
