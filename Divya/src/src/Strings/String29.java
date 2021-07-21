public class String29 {
    static void permu(String str, String ans)
    {
        if (str.length() == 0) {                    // If string is empty
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);                // ith character of str
            String st = str.substring(0, i) +                 // Rest of the string after excluding
                    str.substring(i + 1);                     // the ith character
            permu(st, ans + ch);                    // Recurvise call
        }
    }
    // Driver code
    public static void main(String[] args)
    {
        String s = "div";
        permu(s, "");
    }
}