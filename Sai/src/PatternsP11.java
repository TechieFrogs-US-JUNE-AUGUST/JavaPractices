import java.util.Scanner;

public class PatternsP11 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println(" Number of lines : ");
        int lines = scannerObj.nextInt();
        //char ch = 'A';
        int ch = 65;
        for(int i = 0; i <= lines ; i++){
            for(int j = i; j >= 0 ; j--){
                //System.out.print((ch+j) + " ");
                System.out.print((char)(ch+j)+" ");

            }
            System.out.println();
        }
        scannerObj.close();
    }
}
