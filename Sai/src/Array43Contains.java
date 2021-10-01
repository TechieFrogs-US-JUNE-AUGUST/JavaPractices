import java.util.Scanner;
public class Array43Contains {
    public static void main(String args[]){
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Give Length : ");
        int length = scannerObj.nextInt();
        int Array[] = new int[length];
        System.out.println("Give Array ");
        for(int i = 0; i < length ; i++){
            Array[i] = scannerObj.nextInt();
        }
        System.out.println("Enter Value to Check : ");
        int value = scannerObj.nextInt();
        for(int i = 0; i<Array.length; i++){
            if(value == Array[i])
                System.out.println("Array contains the given Value");
        }
        scannerObj.close();
     }    
}
