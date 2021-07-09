import java.util.Scanner;

public class RightPascal{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");

        int rows = scan.nextInt();
        //for first half
        for (int i= 0; i<= rows-1 ; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("* ");   //Prints i number of stars
            } System.out.println("");
        }
        //for second half
        for (int i=rows-1; i>=0; i--) {
        for(int j=0; j <= i-1;j++){
            System.out.print("* ");
        } System.out.println("");
        }
        scan.close();
    }
}

