package Strings;


public class Assignment15 {
    public static void main(String[] args) {
        
        String st="i am sivanag";
        String st2= "";
    //tringBuffer stb = new StringBuffer("i am sivanag");
    String st1[]=st.split(" ");
    //System.out.println(st1.length);
    for(int i=0;i<st1.length;i++)
    {
        String s1 = st1[i].substring(0, 1);
        String s2 =st1[i].substring(1);
        //System.out.println(s1 +" "+s2);
        s1=s1.toUpperCase();
       // System.out.println(s1 +" "+s2);
        st2=st2+s1+s2+" ";
    }
    System.out.println(st2);
}
}
