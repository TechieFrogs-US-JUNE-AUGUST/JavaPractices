//Swap two strings without using third Variable
package Strings;
public class Assignment44 {
    public static void main(String[] args) {
        String string1="Sivanag";
        String string2=" Nihal";
        System.out.println("String1 : " +string1 +" String2 : " +string2);
        string1=string1+string2;
        string2=string1.substring(0,string1.length()-string2.length());
        //System.out.println("String2: "+string2);
        string1=string1.substring(string2.length());
        System.out.println("String1 : " +string1 +" String2 : " +string2);
    }
    
}
