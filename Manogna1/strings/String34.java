package strings;


public class String34 {
    public static void main(String[] args) {
        String str1="manogna";
        String str2="angonam";
        String str3="";
        if(str1.length()!=str2.length())
        {
            System.out.println("Second string is not a rotation of first string");
        }
        else
        {
            str3=str1+str2;
             if(str3.contains(str2))
             {
                 System.out.println("Yes ,One string is a rotation of another");
             }
                 
            else 
                 {
                     System.out.println("No ,One string is not a rotation of another");
                 }
        }


    }
    
}
