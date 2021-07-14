package Patterns;

public class Pattern14 {
    public static void main(String[] args) {
        int letter=65;
        for(int i=0; i<=5; i++){                       //for rows
            for(int j=0; j<=i; j++){                   //for columns            
                System.out.print((char)(letter+j)+" ");
            }
            for(int k=i-1; k>=0; k--){                //for printing reversely in a row
                System.out.print((char)(letter+k)+" ");
            }
            System.out.println(" ");
        }
    }
}
