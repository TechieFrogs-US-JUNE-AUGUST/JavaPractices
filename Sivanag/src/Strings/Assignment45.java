package Strings;

public class Assignment45 {
    static String[] sortArray(String[] string)
    {
        for (int i=0;i<string.length;i++) {
            for(int j=i+1;j<string.length;j++)
            if(string[i].length()>string[j].length())
            {
            String temp=string[i];
            string[i]=string[j];
            string[j]=temp;
            }
        }
        return string;
    }
    public static void main(String[] args) {
        String string="asasa asasasa asa adfa aa fdcasdf asa";
        String string1[]=string.split(" ");
        String string2[]=new String[string1.length];
        int i=0,j=0;
        //String string4[]=new String[string1.length];
        for (String  string3 : string1) {
            if(Assignment33.isPalindrom(string3))
            {
                //string4[i]=string3;
                i++;
            }
        } 
        String string4[]=new String[i];
        for (String  string3 : string1) {
            if(Assignment33.isPalindrom(string3))
            {
                string4[j]=string3;
                j++;
            }
        }
           
        string2=Assignment45.sortArray(string4);
            for (String string5 : string2) {
                System.out.println(string5 +" ");
            }


    }
    
}
