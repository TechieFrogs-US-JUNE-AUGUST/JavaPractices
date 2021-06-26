import java.util.Scanner;
    public class LeftPascal {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number of rows: ");
            int rows = scan.nextInt();
            //first half
            for (int i= 1; i<= rows ; i++) {
                for (int j=i; j<rows ;j++) {
                    System.out.print("1");    //Prints Space
                }for (int k=1; k<=i;k++) {
                    System.out.print("*");    //Prints Star
                }
                System.out.println("");
            }
            //Second half
            for (int i=rows; i>=1; i--) {
            for(int j=i; j<=rows;j++) {
                System.out.print(" ");      //Prints Space
            }for(int k=1; k<i ;k++) {
                System.out.print("*");      //Prints Star
            }
            System.out.println("");
        }
            scan.close();
        }
    }

