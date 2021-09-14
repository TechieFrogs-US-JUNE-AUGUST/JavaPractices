import java.util.Scanner;

public class Coding3 {
    public static void main(String[] args) {
        int weight;
        Scanner scannerObj = new Scanner(System.in);
        do{  // validation for an Integer input value
            System.out.println("Give the weight of clothes you kept inside the Washing Machine : ");
            while(!scannerObj.hasNextInt()){
                System.out.println("Give the Integer Value");
                scannerObj.next();
            }
            weight = scannerObj.nextInt();
        }while(weight < 0);
        if(weight > 0 && weight <= 2000){
            System.out.println("Time Estimated : 25 Minutes");
        }else if (weight > 2000 && weight <= 4000){
            System.out.println("Time Estimated : 35 Minutes");
        }else if (weight > 4000 && weight <= 7000){
            System.out.println("Time Estimated : 45 Minutes");
        }else{
            System.out.println("Invalid Input");
        }
        scannerObj.close();
    }
}
