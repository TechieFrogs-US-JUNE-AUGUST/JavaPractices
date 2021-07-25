//Find all permutations of a string
package Strings;
//import java.util.Scanner;
public class Assignment29 {
    static void permp(String s)
    {
        
            char[] ch =s.toCharArray();
            char ch1[] =new char[ch.length];
             char temp=' ';
            for(int j=ch.length-1;j>1;j--)
            {
                temp= ch[j];
                ch[j]=ch[j-1];
                ch[j-1]=temp;
                System.out.println(String.valueOf(ch));
            }

        
    }
    public static void main(String[] args) {
        // Scanner scannerobj= new Scanner(System.in);      //scanner object
        // System.out.println("Enter the String ");
        // String string =scannerobj.nextLine();   
        String string ="abcd";
        String s="",m,m1="";
        for(int i=0;i<string.length();i++)              //for loop till i reaches string length
        {
           m=string.substring(0, i);
           m1=string.substring(i+1);
            s=string.charAt(i)+m+m1;

             System.out.println(s+" ");

            permp(s);
        }
        //scannerobj.close();
}
}
