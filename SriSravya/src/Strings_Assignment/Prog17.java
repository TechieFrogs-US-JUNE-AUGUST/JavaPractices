//ITERATE THROUGH RACH CHAR OF THE USING USING FOR LOOP
package Strings_Assignment;

public class Prog17 {
    public static void main(String[] args) {
        String s="Sravya";
        System.out.println("Characters in " +s+ " are: ");

        for(int i=0; i<s.length(); i++){
            char a= s.charAt(i);                   //access each character with index position
            System.out.print(a+ " , ");
        }
    }
}
