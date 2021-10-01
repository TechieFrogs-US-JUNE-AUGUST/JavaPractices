import java.util.Scanner;
public class Coding11 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println(" Give the year");
        int year = scannerObj.nextInt();
        if(year/4 == 0){
            System.out.println("Then it is a Leap Year");
        }else if(year/100 == 0){
            System.out.println(" Then it is not a Leap Year");
        }else if(year/400 == 0){
            System.out.println(" Then it is not a Leap Year");
        }else 
            System.out.println("Then it is a Leap Year");
        scannerObj.close();
    }
}
