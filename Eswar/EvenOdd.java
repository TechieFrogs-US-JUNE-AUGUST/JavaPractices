import java.util.Scanner ;

public class EvenOdd
{
    private static final Scanner SCANNER = new Scanner(System.in);

public static void main(String[] args)
     {

        System.out.print("Enter the number: ");
        int num = SCANNER.nextInt();
         

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}