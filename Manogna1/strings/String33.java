package strings;

public class String33 {
    public static void main(String[] args) {
        String str="12344321";
        boolean flag=true;
        str=str.toLowerCase();
        for(int i=0;i<str.length()/2;i++)
        {//Iterate string forward and backwrd compare one char at a time till it reaches the middle of the string
            if(str.charAt(i)!= str.charAt(str.length()-i-1))
                {
                    flag=false;
                    break;

                }   
        }
        if(flag)
        System.out.println("String is Palindrome");
        else
        System.out.println("String is not Palindrome");

    }
    
}
