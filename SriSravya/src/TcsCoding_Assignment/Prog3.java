package TcsCoding_Assignment;
import java.util.Scanner;

public class Prog3 {
    public static void calculateTime(int n){                 //method with one parameter
        if(n==0){
            System.out.println("Time Estimated: 0 Minutes" );
        }
        else if(n>0 && n<=2000){
            System.out.println("Time Estimated: 25 Minutes");
        }
        else if(n>2000 && n<=4000){
            System.out.println("Time Estimated: 35 Minutes");
        }
        else if(n>4000 && n<=7000){
            System.out.println("Time Estimated: 45 Minutes");
        }
        else{
            System.out.println("INVALID INPUT");
        }
    }

    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);
        System.out.println("Enter Input value: ");         //reading i/p from user
        int machineWeight= scannerObj.nextInt();
        calculateTime(machineWeight);                    //calling method by passing i/p as argument

        scannerObj.close();
    }
}
