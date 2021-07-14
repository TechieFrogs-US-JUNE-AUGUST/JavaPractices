package Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        int letter=65;
        for(int i=1; i<=6; i++){                    //for rows 
            for(int j=6; j>1; j--){                //prints space in each row at the start
                System.out.print(" ");                 
            }
            int temp=1;
            for(int k=1; k<=i; k++){                       //for columns
                System.out.print((char)(letter-1+temp)+" ");
                temp=temp*(i-k)/k;
            }
            System.out.println();
        }
    }
}
