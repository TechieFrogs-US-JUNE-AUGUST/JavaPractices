public class StringContains {
    public static void main(String[] args)
    {
        String str = "Example of the substring";
String substr = str.substring(8,10);
   System.out.println(substr);
        
        if(str.contains(substr))
         {
            System.out.println("String is a part of the main String");
        }
        else {
            System.out.println("String is not a part of the main String");
        }
     
    }
}