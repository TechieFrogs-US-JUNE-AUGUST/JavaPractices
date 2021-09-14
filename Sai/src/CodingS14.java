import java.util.Scanner;

public class CodingS14 {
    public static void main(String args[]) { // Digi Root - sum of number until it becomes single digit(1-9)
        Scanner sc = new Scanner(System.in); 
        System.out.println("Give the number"); 
        int number = sc.nextInt();  
        int root= 0; 
        int orginal = number; //assigning the orginal value in value
        while (number > 0 || root > 9){  //checking the number is not 0 and root value is under 9
             if (number == 0) {
                number = root;
                root = 0;
            }             
            root += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits of "+orginal+" is : "+root); 
        sc.close();
    }
}
