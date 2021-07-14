package Patterns;

public class Prog3 {
    public static void main(String[] args) {
        int lines=4;
        int i,j;
        for(i=1;i<=lines;i++){               //prints lines
            for(j=1;j<=lines;j++){          //print * in a line
                if(i==j)
                System.out.print("*"); 
                else
                System.out.print("0");  
             }
             j--;
             System.out.print("*");
             while(j>=1){                   //prints * in a line for the other half in a line
                 if(i==j)
                 System.out.print("*");
                 else
                 System.out.print("0");
                 j--;
             }
             System.out.println("");
        }
    }
}