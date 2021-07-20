package strings;

public class String38 {
    public static void main(String[] args) {
        String str="Strings Assignment Strings ";
        str=str.toLowerCase();
       
        String words[]=str.split(" ");//Splits the string into words using build in fnctn
        System.out.println("Duplicate words in a given string are :");
        //System.out.println(str.length());
        //System.out.println(words.length);
        for(int i=0;i<words.length;i++)
        {
           
            for(int j=i+1;j<words.length;j++)
            {
               if(words[i].equals(words[j]));
            
                {
                   
                    System.out.println(words[j]);
                    
                }
            }
            
    
        }
    
    }
    
}
