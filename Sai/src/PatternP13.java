import java.util.Scanner;
public class PatternP13 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Gives the number of lines to print : ");
        int lines = scannerObj.nextInt(); 
        for(int i = 1; i <= lines; i++){// this loop is used to go to next line  
            for(int j = 1; j <= i; j++){// this loop is used to print numbers  
                System.out.print(i*j+" ");  
            }  
            System.out.println("");  
        }  
        scannerObj.close();
    }
}
