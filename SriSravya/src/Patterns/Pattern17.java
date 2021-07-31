package Patterns;

public class Pattern17 {
    public static void main(String[] args) {
        int letter= 65;
        for(int i=0; i<=5; i++){                         //first half rows
            for(int j=0; j<i; j++){                      //prints space in each row at the start
                System.out.print(" ");                   
            }
            for(int k=i; k<=5; k++){                     //first half columns
                System.out.print((char)(letter+k));
            }
            System.out.println();
            }             

            for(int i=5; i>=0; i--){                    //second half rows
                for(int j=0; j<i; j++){                //prints space in each row at the start
                    System.out.print(" ");
            }
            for(int k=i; k<=5; k++){                   //second half columns
                System.out.print((char)(letter+k));
            } 
            System.out.println();
        }
    }
}
