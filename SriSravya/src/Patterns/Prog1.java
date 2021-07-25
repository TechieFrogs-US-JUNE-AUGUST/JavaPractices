package Patterns;

public class Prog1 {
    public static void main(String[] args) {
        int i,j;
        int lines=5;
        for(i=1;i<=lines;i++){              //print the lines
            for(j=lines;j>=1;j--){          //prints the number in the respective lines
                if(j!=i)
                System.out.print(j);
                else
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
