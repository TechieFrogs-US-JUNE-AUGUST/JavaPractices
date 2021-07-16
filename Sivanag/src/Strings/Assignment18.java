package Strings;

public class Assignment18 {
    public static void main(String[] args) {
        String st ="sivanagaBabu";
        
        String s="";
        //char ch[] =new char[st.length()];
        char ch[] = st.toCharArray();
        // for(int i=0;i<st.length();i++) //for
        // {   
        //     ch[i]=st.charAt(i);         //Given String to Charater Array
        // }

        
            for (char ch1: ch)      //foreach using Character Array
             {
                s=s+"'" + ch1 + "' ";   
            }
            System.out.print(s);    //Print each Characters
      
              
           


        
    }
   
    
}