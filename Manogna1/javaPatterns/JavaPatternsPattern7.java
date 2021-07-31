package javaPatterns;

public class JavaPatternsPattern7 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++)
        {
            int alphabet=65;
            for(int j=5;j>=i;j--)
            {
                System.out.print((char)(alphabet+j) +" ");
                //alphabet++;
            }
            System.out.println();
        }
    }
    
}
