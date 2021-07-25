//Determine whether one string is a  rotation of another 
package Strings;
public class Assignment34 {
    public static void main(String[] args) {
        
   
    String string1="siva";
    String string2="asiv";
    String string3="";
    if(string1.length()==string2.length())
    {
        string3=string1+string1;
        if(string3.contains(string2))
          System.out.println("Yes ,One string is a rotation of another");
        else
            System.out.println("No ,One string is not a rotation of another");  
        
    }
    }
}
