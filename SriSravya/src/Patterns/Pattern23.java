package Patterns;

public class Pattern23 {
    public static void main(String[] args) {
        int letter= 65;
        for(int i=0; i<=5; i++){                              //for rows
            for (int j=5; j>i; j--){                          //prints space at the start of each row
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++){                         //for columns
                System.out.print((char)(letter + i) + " ");
            }
            System.out.println();
        }
    }
}
