package Patterns;

public class Pattern22 {
    public static void main(String[] args) {
        int letter= 65;
        for(int i=0; i<=5; i++){                                       //for rows
            for(int j=i; j<=5; j++){                                   //for columns
                System.out.print((char)(letter + j) + " ");
            }
            for(int k=4; k>=i; k--){                              //for reverse of the letter in each row
                System.out.print((char)(letter + k) + " ");
            }
            System.out.println();
        }
    }
}
