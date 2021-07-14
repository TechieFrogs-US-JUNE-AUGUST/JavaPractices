package Patterns;

public class Pattern15 {
    public static void main(String[] args) {
        int letter=65;
        for(int i=0; i<=5; i++){             //for rows
            for(int j=0; j<=i; j++){         //prints space in each row at the start
                System.out.print(" ");
            }
            for(int k=0; k<=5-i; k++){         //for columns
                System.out.print((char)(letter+k)+" ");
            }
            System.out.println();
        }
    }
}
