package Methods;

public class PrintIntandChar {
    void printintandchar(int n, char c){
        System.out.print(n);
        System.out.print(c);
        System.out.println();//create space
    }
    void printintandchar(char c,int n)
    {
        System.out.print(c);
        System.out.print(n);
        System.out.println();
    }
}
class AddPrintIntandChar{// calling for integer and character
    public static void main(String[] args){
        PrintIntandChar printintandchar = new  PrintIntandChar();
        printintandchar.printintandchar(7,'c');
        printintandchar.printintandchar('c',7);
    }
}
