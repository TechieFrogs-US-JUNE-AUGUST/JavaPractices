package Patterns;

public class Pattern28 {
    public static void main(String[] args) {
        int letter= 65;
        for(int i=0; i<=5; i++){                            //for rows
           for(int j=0; j<5-i; j++){                        //for printing the columns for the first half of each row
               System.out.print((char)(letter+j));        
           }
           for(int k=5-i-2; k>=0; k--){                   //for printing the columns for the second half of each row
               System.out.print((char)(letter+k));
           }
           System.out.println();
        }
    }
}
