package javaPatterns;

public class JavaPatterns4 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++) //prints number of lines
        {
            for(int j=1;j<=i;j++)  // Print number of lines 
            {
                System.out.print(" " + i*j + " "); 
            }
        
        System.out.println();
    }
    
}
}
