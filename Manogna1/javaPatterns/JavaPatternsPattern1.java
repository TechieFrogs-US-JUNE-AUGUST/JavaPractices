package javaPatterns;

public class JavaPatternsPattern1 {
    public static void main(String[] args) {
       // int alphabet=65;
        for(int i=1;i<=5;i++)
        {
        int alphabet=65;
        
            for(int j=1;j<=i;j++)
            {
            System.out.print((char)alphabet);
            alphabet++;

             }
             System.out.println( );
        }
    }
}

