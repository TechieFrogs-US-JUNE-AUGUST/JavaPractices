package Strings;

import java.util.Arrays;



public class Assignment21 {
    String sortstring(String c)
    {
        char ch[]=c.toCharArray();
        Arrays.sort(ch);
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
            String string1= "ab";
            String string2 = "123";
            String stringmain= "ab231";
            Assignment21 obj21 = new Assignment21();
        if(string1.length()+string2.length()==stringmain.length())
        {
            string1=obj21.sortstring(string1);
            string2=obj21.sortstring(string2);
            stringmain=obj21.sortstring(stringmain);
            System.out.println(stringmain);
            int i=0,j=0, k=0;
            while(k!=stringmain.length())
            {
            if((i<string1.length())&&(string1.charAt(i)==stringmain.charAt(k)))
                  i++;
                else
                if((j<string2.length())&&(string1.charAt(j)==stringmain.charAt(k)))
                    j++;
                     else
                     {
                     System.out.println("Not valid Shuffle");
                                         break;
                    }
                    // return false;
                    k++;
            }
            // if((i<string1.length()) || (j<string2.length()))
            // System.out.println("Not valid Shuffle");
            // else
            // System.out.println(" valid Shuffle");

        }else
        System.out.println("Not valid Shuffle");



    }

    
}
