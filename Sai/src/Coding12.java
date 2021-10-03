import java.util.Scanner;

public class Coding12 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int number;
        do{
            System.out.println("Enter the value");
            while(!scannerObj.hasNextInt()){
                System.out.println("Give the positive Number");
                scannerObj.next();
            }
            number = scannerObj.nextInt();
        }while(number < 0);
        if (number < 2){
            System.out.println("Given Number is not a Prime Number");
        }else if(number == 2 || number == 3){
            System.out.println("Given Number is a Prime Number");
        }else if (number%2 == 0 || number%3 == 0 ){
            System.out.println("Given Number is not a Prime Number");
        }else
            System.out.println("Given Number is a Prime Number");
        scannerObj.close();
    }
}
