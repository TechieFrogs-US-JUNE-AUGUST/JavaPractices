package STRINGS;

public class CapitalizeFirstcharacter
 {
  public static void main(String[]args)
  {
      String name = "javastringprogram";
      String s1 = name.substring(0,1); //creating substring for 1st letter of given name 
      String s2 = name.substring(1,name.length());//substring for remaing letters in name 

      s1 = s1.toUpperCase();          //used to change first letter to uppercase
      name = s1+ s2;                  // adding two substrings
      System.out.println("Name:"+ name);

   }   
 }
