import java.util.Scanner;

public class FloydNumber {
    public static void main(String[] args){
       // Scanner scan=new Scanner(System.in);
        //System.out.print("Enter number of rows: ");
        //int rows=scan.nextInt();

        int floydNumber=1, rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(floydNumber+" ");
                floydNumber++;
            }System.out.println();
        }
    }
}
