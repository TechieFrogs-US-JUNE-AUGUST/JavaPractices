package Practice.Serialization;

import java.util.Scanner;

public class obbb {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name=sc.nextLine();
        System.out.print("Enter Number1 : ");
        int num1=sc.nextInt();
        System.out.print("Enter Number2 : ");
        int num2=sc.nextInt();
        System.out.println(name + " will receive " + num1 + " in " + num2 + " years.");
        sc.close();
        
    }

    
}
