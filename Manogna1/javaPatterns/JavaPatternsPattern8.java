package javaPatterns;

public class JavaPatternsPattern8 {
    public static void main(String[] args) {
        for(int i=5;i>=0;i--)
        {
            int alphabet=65;
            for(int j=5;j>=i;j--)
                {
                    System.out.print((char)(alphabet+j)+" ");
                }
                System.out.println();


        }
    }
    
}
