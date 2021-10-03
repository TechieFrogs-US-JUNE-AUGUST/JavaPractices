import java.util.Scanner;

public class PatternsP14 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Number of lines : ");
        int lines = scannerObj.nextInt();
        for (int i = 0; i <= lines; i++){
            int ch = 65;
            for (int j = 0; j <= i; j++){
                System.out.print((char) (ch + j) + " ");
            }
            for (int k = i - 1; k >= 0; k--){
                System.out.print((char) (ch + k) + " ");
            }
            System.out.println();
        }
        scannerObj.close();
    }
}
