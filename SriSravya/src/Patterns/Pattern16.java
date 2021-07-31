package Patterns;

public class Pattern16 {
    public static void main(String[] args) {
        int letter= 65;
        for(int i=0; i<6; i++){                       //first half rows
            for(int j=6; j>=i; j--){                 //prints space in each row at the start
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){                //first half columns
                System.out.print((char)(letter+k)+" ");
            }
            System.out.println();
        }
        
        for(int i=0; i<=6; i++){                     //second half rows
            for(int j=0; j<=i; j++){                //prints space in each row at the start
                System.out.print(" ");
            }
            for(int k=0; k<=6-i; k++){             //second half columns
                System.out.print((char)(letter+k)+" ");
            }
            System.out.println("");;
        }
    }
}
