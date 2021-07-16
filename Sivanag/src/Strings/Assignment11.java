package Strings;

import java.util.Random;



public class Assignment11 {
    public static void main(String[] args) {
            String st = "//\' ##$afdsfbba23676575";
            Random ra= new Random();
            int n=6;
            StringBuilder build = new StringBuilder();
            
            for(int i=0;i<n;i++)
            {
                //int index =(int) (st.length() *Math.random());
                int index =ra.nextInt(st.length());
                if(('a'<= st.charAt(index)) && ('z'>=st.charAt(index)) || ('a'<= st.charAt(index)) && ('z'>=st.charAt(index)) || (48<= st.charAt(index)) && (57>=st.charAt(index))  )
                {
                    //System.out.println(st.charAt(index));
                //if((0<= st.charAt(index)) && (9>=st.charAt(index)))
                build.append(st.charAt(index));
            }
                else
                i--;
            }

            System.out.println(build);

    }


}
