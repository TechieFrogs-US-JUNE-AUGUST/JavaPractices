package Patterns;

public class Pattern27 {
    public static void main(String[] args) {
        int letter= 65;
        for(int i=0; i<5; i++){                                //for rows
            for(int j=0; j<5; j++){                            //for columns
                System.out.print((char)(letter+ i+j));         //prints the char of next numbers
            }
            System.out.println();
        }
    }
}
