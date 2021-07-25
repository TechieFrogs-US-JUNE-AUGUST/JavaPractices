package strings;

public class String35 {
    public static void main(String[] args)
    {
   
        String str="Strings";
        String reverseStr="";
        System.out.println("String is : " +str);
        for(int i=(str.length()-1);i>=0;i--)
        {
            reverseStr=reverseStr+str.charAt(i);
        } 
        System.out.println("Reversed String : " +reverseStr);

    }  
}
