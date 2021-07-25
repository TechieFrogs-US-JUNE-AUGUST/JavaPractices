//Iterate through each character of the string using for loop
package Strings;
public class Assignment17 {
    public static void main(String[] args) {
        String st ="sivangaBabu";
        
        String s="";
        for(int i= 0;i<st.length();i++)
           {
               s="'" + st.charAt(i) + "' ";
            System.out.print(s);
        }
    }     
}
