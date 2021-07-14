package Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        int ref=65;
        for(int i=70;i>=65;i--)
        {
            for(int j=70;j>=ref;j--)
            {
                System.out.print((char)j);



            }
            System.out.println();
            ref++;
        }

    }
    
}
