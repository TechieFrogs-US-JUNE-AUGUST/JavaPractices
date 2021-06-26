import java.util.Scanner;
    public class SandGlass{
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int rows=0;
            do {
                System.out.println("Enter the positive number of rows: ");
                while(!scan.hasNextInt()) {
                    System.out.println("It is not number.Please enter number");
                    scan.next();
                }
                rows = scan.nextInt();
            }while(rows<=0);
            System.out.println("It is a number");

            //first half
            for (int i= 0; i<= rows-1 ; i++) {
                for (int j=0; j <i; j++) {
                    System.out.print(" ");       //Prints space
                }for (int k=i; k<=rows-1; k++) {
                    System.out.print("*"+" ");       //Prints Star
                } System.out.println("");
            }
            //second half
            for (int i= rows-1; i>= 0; i--) {
            for (int j=0; j< i ;j++) {
                System.out.print(" ");
            }for (int k=i; k<=rows-1; k++) {
                System.out.print("*"+" ");
            }System.out.println("");
        }
            scan.close();
        }
    }
