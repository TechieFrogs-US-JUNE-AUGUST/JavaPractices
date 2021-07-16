import java.util.Scanner;
public class Patterns1{
    public static void main(String[] args){
        int i,j,lines;
        Scanner l = new Scanner(System.in);
        System.out.println("Give the numbers for lines : ");
        lines = l.nextInt();
        for(i=1; i<=lines; i++){  // 
            for(j=lines; j>=1 ; j--){
                if(j!=i)
                     System.out.print(j);
                else
                     System.out.print("*");
            }
            System.out.println(" ");
        }
        //System.out.println(" ");
    }
}