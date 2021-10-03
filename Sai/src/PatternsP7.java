//import java.util.Scanner;

public class PatternsP7 {
    public static void main(String[] args) {
        //Scanner scannerObj = new Scanner(System.in);
        //System.out.println("Number of lines : ");
        //int lines = scannerObj.nextInt();
        int lines = 6;
        char ch = 'F';
        for( int i = 0; i < lines ; i++){
            for(int j = 0 ; j <= i; j++){
                System.out.print(ch);
                ch--;
            }
            ch = 'F';
            System.out.println();
        }
        //scannerObj.close();
    }
}
