import java.util.InputMismatchException;
import java.util.Scanner;
public class Assesment {
    public static void main(String[] args){
        int rows = 0;
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Give how many row od pyramid you want : ");
        try {
             rows = scannerObj.nextInt();
        } catch (InputMismatchException ie) {
            System.out.println("from catch block");
            ie.printStackTrace();
        }
        for(int i = 0 ; i < rows ; i++){ // to enter the different rows
            for(int j = rows-i ; j > 1; j--){ //to give the spaces to show the pyramid shape before star
                System.out.print(" "); // it give spaces
            }
            for(int j = 0; j <= i; j++ ){// to display the star
                System.out.print("* ");
            }
            System.out.println();
        }
        scannerObj.close();
    }
}
