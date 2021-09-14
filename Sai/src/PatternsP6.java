import java.util.Scanner;

public class PatternsP6 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("How many rows you want : ");         
        int rows = scannerObj.nextInt();                
        int alphabet = 65; // ASCII value of 'A'        
        for (int i= 0; i<= rows-1 ; i++){
            for (int j=rows-1; j>i; j--){
                 System.out.print(" ");
            }
            for (int k=0; k<=i; k++){
                 System.out.print((char) (alphabet+k) + " ");
            }
            System.out.println();
        }
        scannerObj.close();
    }
}
