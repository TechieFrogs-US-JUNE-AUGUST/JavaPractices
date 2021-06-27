public class Alphabet 
{
    public static void main(String[] args)
     {

        char n = '8';

        if( (n >= 'a' && n <= 'z') || (n >= 'A' && n <= 'Z'))
            System.out.println(n + " is an alphabet.");
        else
            System.out.println(n + " is not an alphabet.");
    }
}