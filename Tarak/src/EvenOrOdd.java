

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int i=sc.nextInt();
        if(i%2==0){
            System.out.println(i+ " is Even number");
        }
        else{
            System.out.println(i+ " is Odd number");
        }
    }
}
