import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        //int number1=100;
        //int number2=95;
        //int number3=150;
        int number1,number2,number3;
        System.out.println("Enter first number");
        Scanner sc=new Scanner(System.in);
        number1=sc.nextInt();
        System.out.println("Enter Second number" );
        //Scanner input=new Scanner(System.in);
        number2=sc.nextInt();
        System.out.println("Enter Third Number");
        //Scanner sc1=new Scanner(System.in);
        number3=sc.nextInt();
        if(number1>=number2  && number1>=number3)
            System.out.println(number1+ "is the largest Number");
        else if(number2>=number1 && number2>=number3)
            System.out.println(number2+ "is the largest number");
        else
            System.out.println(number3+ "is the largest number");
            sc.close();

    }
}

