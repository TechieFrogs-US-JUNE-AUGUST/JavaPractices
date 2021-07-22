package strings;

public class String38 {
    public static void main(String[] args) {
        String str="Strings Assignment Strings Program Strings";
        //str=str.toLowerCase();
        //int c=0;
       
        String words[]=str.split(" ");//Splits the string into words using build in fnctn
        
        //System.out.println(words.toString());
        //System.out.println(str.length());
        //System.out.println(words.length);
        for(int i=0;i<words.length;i++)
        {
            System.out.println(words[i]);
        }
        System.out.println("Duplicate words in a given string are :");
        for(int i=0;i<words.length;i++)
        {
           int c=0;
            for(int j=i+1;j<words.length;j++)
            {
               if(words[i].equals(words[j]))
            
                {
                   
                   c=1;
                    
                }
            }
            if(c==1)
        {
            System.out.println(words[i]);
        }
            
    
        }
        
    
    }
    
}
