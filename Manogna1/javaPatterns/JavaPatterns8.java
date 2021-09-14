package javaPatterns;

public class JavaPatterns8 {
    public static void main(String[] args) {
        System.out.print("0");
        System.out.println();
        for(int i=9; i>=1; i--)
        {
            for(int j=i; j<=9; j++)
                System.out.print(j);
            System.out.print("0");
            for(int j=9; j>=i; j--)
                System.out.print(j);
          System.out.println();
    }
    
}
}