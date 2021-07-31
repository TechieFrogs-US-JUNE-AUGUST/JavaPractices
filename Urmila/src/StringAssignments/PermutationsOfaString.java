package StringAssignments;

public class PermutationsOfaString
{
    static void permutation(String str, String ans)
    {
        if (str.length() == 0)                     // If string is empty
        {
         System.out.print(ans + " ");
         return;
        }
         for (int i = 0; i < str.length(); i++) 
         {
            char ch = str.charAt(i);                // ith character of str
            String st = str.substring(0, i) +  str.substring(i + 1);     // Rest of the string after excluding
            permutation(st, ans + ch);                    // Recurvise call
        }
    }
    public static void main(String[] args)
    {
        String s = "hanshu";
        permutation(s, "");
    }
}