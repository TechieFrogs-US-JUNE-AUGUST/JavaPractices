package strings;

public class String22 {
    public static void main(String[] args) {
        String str="Strings Assignment Program 22";
        int count=0;
        for(int i=0;i<str.length();i++)
        if(str.charAt(i)!=' ') //Count each character except space
        count++;
        System.out.println("Total Number of Characters :" +count); //Display total number of Characters
        
    }
    
}
