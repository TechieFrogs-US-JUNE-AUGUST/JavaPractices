import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        int num1;
        System.out.println("Enter First value " );
        Scanner input= new Scanner(System.in);
        num1=input.nextInt();
        if(num1==0)
            System.out.println("Nothing");
        else if(num1%2==0)
            System.out.println("Even Number ");
            else
            System.out.println("Odd Number");

    }
}
