//ITERATE THROUGH EACH CHAR OF STRING USING FOR-EACH LOOP
package Strings_Assignment;

public class Prog18 {
    public static void main(String[] args) {
        String s="Sravya";
        System.out.println("Characters in " +s+ " are: ");

        for(char a: s.toCharArray()) {               //using for-each loop                          
        System.out.print(a+ " , ");               
    }
  }
}
