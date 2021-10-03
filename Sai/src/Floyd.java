import java.util.Scanner;

public class Floyd {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Give number of rows for display :");
        int rows = scannerObj.nextInt();
        int count = 1;
        for (int i = 1 ; i <= rows ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        scannerObj.close();
    }
}
