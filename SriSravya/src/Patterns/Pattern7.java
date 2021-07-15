package Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        int letter=65;
        for(int i=0; i<=5; i++){                      //for rows
            for(int j=5; j>=i; j--){                 //for columns
                System.out.print((char)(letter+j)+" ");
            }
            System.out.println();
        }
    }
}
