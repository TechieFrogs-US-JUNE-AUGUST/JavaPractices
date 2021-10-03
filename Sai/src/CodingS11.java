import java.util.Scanner;

public class CodingS11 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scannerObj.nextInt();
        int sum = 0; // sum of factors of given number
        System.out.println("Factors of "+ num+" are : ");
        sum = factors(num); // calling method for sum of factors excluding the number itself
        System.out.println("Sum of all the factors of given number "+ num + " is : "+sum);
        int sumF = 0;
        sumF = factors(sum);
        System.out.println("Sum of all the factors of  orginal number factors sum "+ num + " is : "+sumF);
        if(sumCompare(sum,sumF) == 1){ //calling sum camparision method 
            System.out.println("Both the sums are equal");
        }else
            System.out.println("Both the sums are not equal");
        scannerObj.close();
    }
    static int factors(int number){ // method for sum of factors
        int sumFac = 0;
        for(int i = 1; i <= number/2; i++ ){
            if (number % i == 0){
                sumFac += i;
                System.out.print(i +" ");

            }
        }
        System.out.println();
        return sumFac;
    }
    static int sumCompare( int a , int b){ // method for checking both the sum values
        if(a == b)
            return 1;
        else
            return 0;
    }
}
