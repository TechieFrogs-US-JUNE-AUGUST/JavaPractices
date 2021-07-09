import java.util.Scanner;
public class AddTwoIntegers {
    public static void main(String[] args) {
   //int number1=10;
     //   int number2=20;
       // int sum=number1+number2;
        //System.out.println(sum);

        int number1,number2,sum;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number");
        number1=sc.nextInt();
        System.out.println("Enter Second Number");
        number2=sc.nextInt();
        sc.close();
        sum=number1+number2;
        System.out.println("Sum of these numbers "+sum);

    }
}
