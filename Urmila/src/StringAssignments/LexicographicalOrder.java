package StringAssignments;

public class LexicographicalOrder 
{
  public static void main(String[] args)
  {
    String words[] = {"apple","ball","cat","dog"};
    for(int i=0; i<words.length; i++)
    {        
      for(int j=i+1; j<words.length; j++)
      {      
          if(words[i].compareTo(words[j])>0)
          {      
          String temp= words[i];               
           words[i]= words[j];
           words[j]= temp;
          }
      }  
    }
            System.out.println("In lexicographical order: ");
            for(int i=0; i<words.length; i++)
            {
            System.out.println(words[i]);
            }  
  }   
}
