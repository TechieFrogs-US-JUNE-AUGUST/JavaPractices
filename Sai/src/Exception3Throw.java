import java.util.Scanner;

public class Exception3Throw {
    public static void main(String args[]){
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Give age : ");
        int number = scannerObj.nextInt();
        validate(number);
        System.out.println("after the method calling");
        scannerObj.close();
    }
    static void validate(int age){
    if(age<18)
        throw new ArithmeticException("not valid - from the throw");
    else
        System.out.println("Welcome to vote");
}
}
