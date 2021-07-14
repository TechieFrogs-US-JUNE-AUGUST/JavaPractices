package Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        int letter=65;
        for(int i=5; i>=0; i--){                       //for rows
            for(int j=0; j<=i; j++){                   //for columns
                System.out.print((char)(letter+j)+" ");
            }
            System.out.println();
        }
    }
}
