import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Number of lines to print : ");
        int lines = scannerObj.nextInt();
        for(int i = 0 ; i <= lines ; i++){
            for(int j = lines ; j > i ; j-- ){
                System.out.print(" ");
            }
            int temp = 1;
            for (int k = 1; k <= i ; k++){
                System.out.print(temp + " ");
                temp = temp*(i-k)/k;
            }
            System.out.println();
        }
        scannerObj.close();
    }
}
