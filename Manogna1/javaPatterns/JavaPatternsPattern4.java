package javaPatterns;

public class JavaPatternsPattern4 {
    public static void main(String[] args) {
        for(int i=6;i>=1;i--)
         {
         int alphabet=65;
         
             for(int j=1;j<=i;j++)
             {
             System.out.print((char)alphabet);
             alphabet++;
              }
             

              System.out.println( );
         }
         for(int i=1;i<=6;i++)
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
