package StringAssignments;

public class CountTotalNumofCharacters 
{
 public static void main(String[]args)
 {
    String s1="My favorite subject is Maths";
    int count=0;

    for(int i=0; i<s1.length(); i++){                
        if(s1.charAt(i)!=' ')                  //counts each character except space
        count++;
    }
    System.out.println("Number of characters in the string are: " +count);
 }    
}
