package javaPatterns;

public class JavaPatternsPattern12 {
    public static void main(String[] args) {
        int alphabet=65;
        for(int i=0;i<=5;i++)
        {   
            int count=5;
            int tempvariable=i;
            for(int j=i;j>=0;j--)
            {
                System.out.print((char)(tempvariable+alphabet-1) +" ");
                tempvariable=tempvariable+count;
                count--;
            }
            System.out.println();
        }
    }
    
}
