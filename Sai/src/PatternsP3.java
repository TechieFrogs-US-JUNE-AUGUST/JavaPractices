import java.util.Scanner;

public class PatternsP3 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Give number of lines : ");
        int lines =scannerObj.nextInt();
        char ch = 'A';
        for( int i = 0; i < lines ; i++){
            for( int j = 0 ; j <= i ; j++){
                System.out.print(ch+" ");
                ch++;
            }
            ch = 'A';
            System.out.println();
        }
        for( int i = 0; i < lines  ; i++){
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
