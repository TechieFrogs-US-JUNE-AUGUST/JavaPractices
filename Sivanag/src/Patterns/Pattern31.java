package Patterns;

public class Pattern31 {
    public static void main(String[] args) {
        int ref2=0;
        for(int i=1;i<5;i++)
        {
            int ref =74;
            
            int ref3;
            for(char j=1;j<=i;j++)
            {
                ref3=ref-ref2;
                System.out.print((char)ref3);

                ref2++;
            }
            
            System.out.println();

        }
    }


    
}
