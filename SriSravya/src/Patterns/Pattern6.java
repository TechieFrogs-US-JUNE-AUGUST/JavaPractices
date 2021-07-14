package Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        int letter=65;
        for(int i=0; i<=5; i++){                    //for rows   
            for(int j=5; j>i; j--){
                System.out.print(" ");               //prints space for rows at the start of the row
            }
            for(int k=0; k<=i; k++){                  //for columns
                System.out.print((char)(letter+k)+" ");
            }
            System.out.println();
        }
    }
}
