package StringAssignments;

public class MostRepeatwordinTheText 
{
    public static void main(String[] args)
    {
        String input="Welcome to java and java programs ";  //create aString 
        String[] words=input.split(" ");  //Split the word from String
        int word=1;    //Variable for getting Repeated word count
        
        for(int i=0;i<words.length;i++) //Outer loop for Comparing       
        {
           for(int j=i+1;j<words.length;j++) //Inner loop for Comparing
           {
              
           if(words[i].equals(words[j]))  //Checking for both strings are equal
              {
                 word=word+1;    //if equal increment the count
                 words[j]="0"; //Replace repeated words by zero
              }   
            }
            if(words[i]!="0")
            System.out.println(words[i]+"--"+word); 
            word=1;
            
           }   
}
}