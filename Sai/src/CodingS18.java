import java.util.Scanner;

public class CodingS18 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scannerObj.nextInt();
        long factorial = 1; // factorials will be big numbers so long
        for(int i = 1; i <= number ; i++){
            factorial = factorial * i; 
        }
        System.out.println("Factorial of the "+number+ " is "+factorial);
        scannerObj.close();
    }
}