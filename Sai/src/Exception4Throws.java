import java.util.Scanner;
public class Exception4Throws {    
        public static void main(String args[]){
            Scanner scannerObj = new Scanner(System.in);
            System.out.println("Give age : ");
            int number = scannerObj.nextInt();
            try {
                validate(number);
            } catch (Exception e) {
                System.out.println("from catch block");
            }
            System.out.println("ending");
            scannerObj.close();
        }
        static void validate(int age) throws Exception{
        if(age<18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("Welcome to vote");
    }
}
