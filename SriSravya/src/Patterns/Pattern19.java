package Patterns;

public class Pattern19 {
    public static void main(String[] args) {
        int letter= 65;
        for(int i=5; i>=0; i--){                            //for rows
            for(int j=0; j<i; j++){                        //prints space at the start
                System.out.print(" ");
            }
            for(int k=i; k<=5; k++){                      //for columns
                System.out.print((char)(letter+k)+" ");
            }
            System.out.println();
        }
    }
}
