import java.util.Scanner;

public class PatternsP9 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Number of line = ");
        int lines = scannerObj.nextInt();
        char ch = 'A';
        for( int i = 1; i <= lines  ; i++){
            for( int j = i ; j <= lines ; j++){
                System.out.print(ch+" ");
                ch++;
            }
            ch = 'A';
            System.out.println();
        }
        scannerObj.close();
    }
}
