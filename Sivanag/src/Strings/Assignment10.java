package Strings;
//Generate Random AlphabetStrings 
public class Assignment10 {
    public static void main(String[] args) {
            String st= "ABCDEFGHIJKabcdefghijk778789";
            int n=5;
            StringBuilder stb =new StringBuilder(n);
            for(int i=0;i<n;i++)
            {
                int indexnum=(int)(st.length() * Math.random());
                if(('a'<= st.charAt(indexnum)) && ('z'>=st.charAt(indexnum)) || ('A'<= st.charAt(indexnum)) && ('Z'>=st.charAt(indexnum)))
                {
                stb.append(st.charAt(indexnum));
                }else
                i--;
            }
            System.out.println(stb);
    }
}
