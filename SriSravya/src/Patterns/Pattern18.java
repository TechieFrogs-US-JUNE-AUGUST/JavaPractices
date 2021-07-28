package Patterns;

public class Pattern18 {
    public static void main(String[] args) {
        int letter= 65;
        for(int i=0; i<=5; i++){                          //for firsthalf rows
            for(int j=0; j<i; j++){                       //prints space in each row at the start
                System.out.print(" ");
            }
            for(int k=i; k<=5; k++){                      //for firsthalf columns
                System.out.print((char)(letter+k) + " ");
            }
            System.out.println();
        }

        for(int i=5; i>=0; i--){                          //for secondhalf rows
            for(int j=0; j<i; j++){                       //prints space in each row at the start
                System.out.print(" ");                
            }
            for(int k=i; k<=5; k++){                      //for secondhalf columns
                System.out.print((char)(letter+k) + " ");
            }
            System.out.println();
        }
    }
}
