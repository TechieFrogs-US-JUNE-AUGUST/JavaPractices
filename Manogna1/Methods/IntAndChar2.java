package Methods;

class Print{

    void print(int n, char c)
    {
        System.out.print(n);
        System.out.print(c);
        System.out.println( );
    }
    void print(char c,int n )
    {
        System.out.print(c);
        System.out.print(n);
        System.out.println();
    }
}

public class IntAndChar2 {
    public static void main(String[] args) {
        Print pr= new Print();
        pr.print(6,'c');
        pr.print('c',6);


    }
    
}
