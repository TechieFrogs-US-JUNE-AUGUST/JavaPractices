package Patterns;

public class Pattern10 {
    public static void main(String[] args) {
        int ref =65;
        int ref1=0;
        int ref2=0;
    for(int i=65; i<71;i++)
    {
        for(int j=ref;j<=i+ref1;j++)
        {
            System.out.print((char)j);
          
           ref++;
           
        }
        System.out.println();
             
        ref2++;
        ref1=ref1+ref2;
    }
}
    
}
