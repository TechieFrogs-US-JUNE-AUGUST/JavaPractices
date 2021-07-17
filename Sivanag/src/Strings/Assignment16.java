//Convert Every Word of a string to Uppercase
package Strings;
public class Assignment16 {
    public static void main(String[] args) {
        
        String st="i am sivanag";
        String st2= "";
    //tringBuffer stb = new StringBuffer("i am sivanag");
    String st1[]=st.split(" ");
    //System.out.println(st1.length);
    for(int i=0;i<st1.length;i++)
    {
        
        st2=st2+st1[i].toUpperCase()+" ";
    }
    System.out.println(st2);
}
}