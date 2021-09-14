import java.util.Scanner;

public class CodingS13 {
    public static void main (String[] args){
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scannerObj.nextInt();
        System.out.println(collatz(number));
        scannerObj.close();
    }
    static int collatz(int num){        
        while (num != 1) {
            System.out.print(num + " ");     
            if ((num & 1) == 1)    // for odd numbers
                num = 3 * num + 1;     
            else                 // for even numbers
                num = num / 2;
        }        
        return num;
    }
}
