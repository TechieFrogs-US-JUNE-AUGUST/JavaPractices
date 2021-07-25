package Patterns;

public class Prog7 {
    public static void main(String[] args) {
        int lines=4;
        int i,j;
        int space=0;
        for(i=0;i<lines;i++){              //print lines
            for(j=1;j<=space;j++){         //prints space
                System.out.print(" ");
            }
            for(j=1;j<=lines;j++){        //print numbers in a line
                if(j<=(lines-i))
                System.out.print(j);
                else
                System.out.print("*");
            }
            j--;  
            while(j>0){                       //print numbers in a line
                if(j>lines-i)
                System.out.print("*");
                else
                System.out.print(j);
                j--;
            }
            if((lines-i)>9)                  //increments space
            space=space+1;
            System.out.println("");
        }
    }
}
