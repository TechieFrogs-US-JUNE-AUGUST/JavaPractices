import java.util.Scanner;

public class PatternsP10 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Number of line = ");
        int lines = scannerObj.nextInt(); // lines = 6 gives exact output
        char ch = 'A';
        for( int i = 0; i < lines ; i++){
            for( int j = 0 ; j <= i ; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        scannerObj.close();
    }
}
