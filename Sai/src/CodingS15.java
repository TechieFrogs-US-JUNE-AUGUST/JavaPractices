import java.util.Scanner;

public class CodingS15 {  //  check again
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("x = a + b");
        System.out.print("Enter the position of x (in place of a or b or x): ");
        String string = scannerObj.nextLine();
        System.out.print("Enter a Value :");
        int a = scannerObj.nextInt();
        System.out.print("Enter b Value :");
        int b = scannerObj.nextInt();     
        int x = a + b;
        char place = string.charAt(0);
        if(place == 'a')
            x = a - b;
            else if(place == 'b')
            x = b - a;
            else if(place != 'x')
            System.out.println("Invalid Input");
            
        System.out.println("Value of x is: " + x);

        scannerObj.close();
    }
}
