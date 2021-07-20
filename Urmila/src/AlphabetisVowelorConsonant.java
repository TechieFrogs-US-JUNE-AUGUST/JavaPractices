public class AlphabetisVowelorConsonant
 {
    public static void main(String[] args)
    {
        char ch = 'h';   // 'h' is stored in a char variable ch 
        switch (ch)      // swith cased is used
        {
            case 'a':    
            case 'e':
            case 'i':
            case 'o':
            case 'u':   //if is any of ('a','e','i','o','u'),vowel is printed
            System.out.println(ch + "is vowel");
            break;
            default:     // default case is executed - consonant is executed
            System.out.println(ch +  "is consonent");

        }
    }
    
}
