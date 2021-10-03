import java.util.Scanner;

public class CodingS16 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("ENter the number : ");//123456789
        int number = scannerObj.nextInt(); 
        String string = Integer.toString(number);
        int numberArray[] = new int[string.length()];
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < string.length(); i++) {
            numberArray[i] = string.charAt(i) -'0'; //temp.charAt(0) is a char '1', we have to take away the 0 
            //numbers[i] = (int)(temp.charAt(i)); // value of 49 from that char value. 
        }                                         //its not 1, it's '1','0' integer value is 49
        for(int i = 0 ; i < string.length(); i++){
            System.out.print(numberArray[i]+" ");
        }
        System.out.println();
        for(int i = 0 ; i < string.length(); i++){
            if((numberArray[i])%2 == 0){
                evenSum += numberArray[i];
                System.out.println("even sum = "+evenSum);
            }else{
                oddSum += numberArray[i];
                System.out.println("odd sum"+oddSum);
            }
        }
        System.out.println("Sum of even numbers in the given number" +number +" is : "+evenSum);
        System.out.println("Sum of odd numbers in the given number" +number +" is : "+oddSum);
        scannerObj.close();
    }
}