package StringAssignments;

import java.util.Arrays;

public class TwoStringAreanagram 
{
    public static void main(String[] args)
    {
        String s1 = "heart";
        String s2 = "earth";
        if (s1.length()==s2.length())
          {
              char[] arr1 = s2.toCharArray();
              Arrays.sort(arr1);
              System.out.println(Arrays.toString(arr1));
              char[] arr2 = s2.toCharArray();
              Arrays.sort(arr2);
              System.out.println(Arrays.toString(arr2));
              System.out.println(Arrays.equals(arr1,arr2));
               if(arr1.equals(arr2))
               {
                   System.out.println("Given two strings are anagram");
               }
               else
               {
                   System.out.println("Given two strings are not anagram");
               }

          }
    }
    
}
