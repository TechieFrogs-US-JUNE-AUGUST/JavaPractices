import java.util.Scanner;

public class Coding18 { // wrong 
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scannerObj.nextInt();
        for(int i = 1 ; i < number ; i++){
            if (number % 5 == 0) {
                number /= 5;
                System.out.println(number);
            } else if (number % 3 == 0) {
                number /= 3;
                System.out.println(number);
            } else if (number % 2 == 0) {
                number /= 2;
                System.out.println(number);
            } else {
                System.out.print("Invalid");
            }
        }
        //System.out.println();
        scannerObj.close();
    }
}
