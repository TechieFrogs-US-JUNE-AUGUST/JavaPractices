package Arrays;

import java.util.Arrays;

public class Arrays1CopyOneArrayTOAnother 
{
    public static void main(String[] args)
    {
      int[] org = new int[] {5,6,7};//initializing an array
      System.out.println("First Array");
    
      for (int i = 0; i < org.length; i++)
            System.out.print(org[i] + " ");
  
        int[] copy = Arrays.copyOf(org, 5); // copying array org to copy
        copy[3] = 11;
        copy[4] = 55;                       // Changing some elements of copy
  
        System.out.println("New Array after copying:");
        for (int i = 0; i < copy.length; i++)
            System.out.print(copy[i] + " ");
    }    
}
