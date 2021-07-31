package javaPatterns;

public class JavaPatternsPattern5 {
    public static void main(String[] args) {
        int alphabet=65;
        for(int i=5;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                System.out.print((char)(alphabet+j) +" ");
             
            }
            System.out.println();
        }
            for(int i=0;i<=5;i++)
            {
              
                for(int j=i;j>=0;j--)
                {
                    System.out.print((char)(alphabet+j) +" ");
                }
                System.out.println();
            }
    }
    
}
