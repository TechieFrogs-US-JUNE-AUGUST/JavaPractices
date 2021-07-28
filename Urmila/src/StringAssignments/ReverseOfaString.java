package StringAssignments;

public class ReverseOfaString 
{
    public static void main(String[] args)
    {
        String string = " java string";     //creating a string    
        String reversedStr = "";    
    
        for(int i = string.length()-1; i >= 0; i--)//Iterate through the string 
        {    
            reversedStr = reversedStr + string.charAt(i);    
        }    
            
        System.out.println("Original string: " + string);       
        System.out.println("Reverse of given string: " + reversedStr);    
    }
    
}
