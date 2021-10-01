import java.util.Scanner;

public class Coding14 {
    public static void main(String[] args){//1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, 2187 …
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the number : "); 
        int number = scannerObj.nextInt(); //16th number in the series    
        if(number % 2 == 0){  // for even number
            number = number / 2;   
            System.out.print((int)(Math.pow(3, number - 1))); // 3 ^ (number-1) times, 3 power(16-1)
            //Math.pow(3, number - 1) gives double number so converting to int
        }else{                  //for odd number
            number = (number / 2) + 1;
            System.out.print((int)(Math.pow(2, number - 1)));
        }                                             
        scannerObj.close();
    }
}