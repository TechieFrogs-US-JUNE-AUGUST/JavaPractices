package strings;

public class String36 {
    public static void main(String[] args) {
        String str=new String("Assignment");
        String reversestring=new String();
        System.out.println("original String : " +str);
        for(int i=(str.length()-1);i>=0;i--)
        {
            reversestring=reversestring+str.charAt(i); //iterate the string from last and stores each character in reversestring

            //System.out.println("Reversed String : " +reversestring);
        }
        System.out.println("Reversed String : " +reversestring);

    }
    
}
