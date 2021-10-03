

public class Assignment16 {
    static String vowelsReplace(String st)
    {
        char[] ch=st.toCharArray();
        char[] vowels={'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<st.length();i++)
        {
            for(int j=0;j<vowels.length;j++)
            {
            if(ch[i]==vowels[j])
            {
                st.replace(st.charAt(i), '%');
            }

            }
        }

        return "fds";
    }
    
}
