package strings;

public class String31 {
    public static void main(String[] args) {
        String str="Assignment";
        StringBuffer str1=new StringBuffer(str);
        //char ch[]=new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
               str1.setCharAt(i,Character.toUpperCase(str.charAt(i)));
               //ch[i]=Character.toUpperCase(str.charAt(i));
            }
            else if(Character.isUpperCase(str.charAt(i)))
            {
                str1.setCharAt(i,Character.toLowerCase(str.charAt(i)));
                //ch[i]=Character.toLowerCase(str.charAt(i));
            }

        }
        System.out.println("String after case conversion :" +str1);
        //System.out.println("String after case conversion :" +String.valueOf(ch));

    }
    
}
