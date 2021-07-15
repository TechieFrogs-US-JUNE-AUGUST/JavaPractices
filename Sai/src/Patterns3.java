import java.util.Scanner;
public class Patterns3{
    public static void main(String[]args){
        int i, j, lines;
        Scanner l = new Scanner(System.in);
        System.out.println("Number of lines you want : ");
        lines = l.nextInt();
        for (i=1; i<=lines; i++){
            for(j=1; j<=lines; j++){
                if(j==i)
                     System.out.print("*");
                else
                     System.out.print("0");
            }
            j--;
            System.out.print("*");
            while(j>=1){
            if(i==j)
                 System.out.print("*");
            else
                 System.out.print("0");
            j--;
        }
        System.out.println("");
        l.close();
    }
}
}