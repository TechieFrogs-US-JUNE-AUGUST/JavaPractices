//import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        int number = 153, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += remainder*remainder*remainder;
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
        /*Scanner scannerObj = new Scanner(System.in);
        System.out.println("Give number");
        int number = scannerObj.nextInt();
        int temp, sum=0, originalNumber;
        orginalNumber = number;
        while(number != 0 ){
            temp = number%10;
            sum += Math.pow(temp, 3);
            number /= 10;
        }  
        if(sum == originalNumber)
            System.out.println("is an amstrong");
        else
            System.out.println("not");*/
    }
}
