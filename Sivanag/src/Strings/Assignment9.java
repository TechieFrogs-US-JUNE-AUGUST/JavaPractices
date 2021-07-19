//check two strings are anagram
package Strings;
public class Assignment9 {
    char[] String2Char(String s)
    {
        char ch[] = new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            ch[i]=s.charAt(i);

        }
        return ch;

    }
    public static void main(String[] args) {
        String ss ="Raca";
        String ss1 ="Care";
        Assignment9 obj9= new Assignment9();
        char c[]=obj9.String2Char(ss);
        char c1[]=obj9.String2Char(ss1);
        if(c.length==c1.length)
        {
            int hh=0;
            int kk=0;
            int hh1=0;
        for(int j1=0;j1<c.length;j1++)
        {
             
             if(((Character.isUpperCase(c[j1]) && (Character.isUpperCase(c1[j1])))) || ((Character.isLowerCase(c[j1]) && (Character.isLowerCase(c1[j1])))))
                {
                    //System.out.println("True");
                  
                }else
                {
                    kk=1;
             System.out.println("Given Strings are not Anagram");
             break;
                }
            } 
            if(kk==0)
            {
              //----------------------------------------  
            for(int j=0;j<c.length;j++)
            {
                  for(int k=0;k<c1.length;k++)
                 {
                    //System.out.println(c[j] +" " +Character.toUpperCase(c1[k]) + " " +Character.toLowerCase(c1[k]));
                    if((c[j]==Character.toUpperCase(c1[k])) || (c[j]==Character.toLowerCase(c1[k])))
                    {
                    hh++;
                    break;
                    //System.out.println("h:" +hh);
                    }
                 }
                }
                 //----------------------------------------  

                 for(int l=0;l<c.length;l++)
                 {
                     for(int m=0;m<c.length;m++)
                     {
                        if((c1[l]==Character.toUpperCase(c[m])) || (c1[l]==Character.toLowerCase(c[m])))
                        {
                        hh1++;
                        break;
                        //System.out.println("h:" +hh);
                        }
                        
                     }
                 }
                    
                  //----------------------------------------  
      
        //System.out.println(hh + " " + c.length +" " +hh1);
        if(hh==c.length && c.length==hh1)
                System.out.println("Given Strings are Anagram");
                else
                System.out.println("Given Strings are not Anagram");
    }
}
      
    else
    System.out.println("Given Strings are not Anagram");
//}
}
}