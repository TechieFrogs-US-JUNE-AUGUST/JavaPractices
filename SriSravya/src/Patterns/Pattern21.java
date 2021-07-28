package Patterns;

public class Pattern21 {
    public static void main(String[] args) {
        int letter= 65;
        for(int i=0; i<=5; i++){                                 //for rows
            for(int j=5; j>i; j--){                             //for printing the A letter in each row
                System.out.print('A' + " ");
            }
            for(int k=0; k<=i; k++){                           //for columns to print next letter other than A
                System.out.print((char)(letter + i) + " ");
            }
            System.out.println();
        }
    }
}
