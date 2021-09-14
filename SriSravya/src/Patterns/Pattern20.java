package Patterns;

public class Pattern20 {
    public static void main(String[] args) {
        int letter= 65;
        for(int i=0; i<=5; i++){                               //for rows
            for(int j=5; j>i; j--){                            //prints space at the start of each row
             System.out.print(" ");
            }
            for(int k=0; k<=i; k++){                           //for columns to print the letter
                System.out.print((char)(letter+k));
            }
            for(int l=i-1; l>=0; l--){                         //prints the reverse of letter in each row
                System.out.print((char)(letter+l));
            }
            System.out.println();
        }
    }
}
