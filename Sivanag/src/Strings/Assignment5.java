package Strings;
public class Assignment5 {
    public static void main(String[] args) {
    String string1="Sivanaga Babu";
    String string2 ="Sivanaga Babu";
    String string3="Sivanaga"+" Babu";
    final String string4 = "Sivanaga";
    String string5=string4 +" Babu";
    String string6="Sivanaga";
    String string7=string6+ " Babu";

    if(string1==string2)
    System.out.println("True");
    else
    System.out.println("False");

    if(string1==string3 && string2==string3)
    System.out.println("True");
    else
    System.out.println("False");
 
    if(string1==string5)
    System.out.println("True");
    else
    System.out.println("False");

    if(string1==string7)
    System.out.println("True");
    else
    System.out.println("False");

    if(string4==string6)
    System.out.println("True");
    else
    System.out.println("False");
}
}
