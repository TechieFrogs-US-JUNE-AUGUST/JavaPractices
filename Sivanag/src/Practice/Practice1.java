package Practice;


//Repeated Same Method
public class Practice1 {
    static void Practice(char[] s,int i)
        {
            if(i<s.length)
            {
            System.out.print(s[i] + " ");
            Practice(s, ++i);
            System.out.print(s[--i] + " ");
            //System.out.println("Done");
            }else
            System.out.println();
        }
    public static void main(String[] args) {
        String string="Nihal Chowdary";
        char ch[]=string.toCharArray();
        Practice(ch,0);
        //string.chars().forEach(System.out ::print );
    }
}
