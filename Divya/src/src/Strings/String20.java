package Strings;

public class String20 {
    public static void main(String args[]) {
        String s1 = "this is example of index";
//passing substring
        int index1 = s1.indexOf("is");//returns the index of is substring
        int index2 = s1.indexOf("example");//returns the index of example substring
        System.out.println(index1 + "  " + index2);
    }
}