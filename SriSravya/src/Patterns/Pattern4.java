package Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        int letter=65;
        for(int i=5; i>=0; i--){                        //first half rows
            for(int j=0; j<=i; j++){                    //first half columns
                System.out.print((char)(letter+j)+" ");
            }
            System.out.println();
        }
        for(int i=0; i<=5; i++){                         //second half rows
            for(int j=0; j<=i; j++){                    //second half columns
                System.out.print((char)(letter+j)+" ");
            }
            System.out.println();
        }
    }
}
