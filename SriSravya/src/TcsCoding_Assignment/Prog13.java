package TcsCoding_Assignment;
import java.util.Scanner;

// 0,0,7,6,14,12,21,18,28
// In this series the odd term is increment of 7 {0, 7, 14, 21, 28, 35 – – – – – –} 
// And even term is a increment of 6 {0, 6, 12, 18, 24, 30 – – – – – – }

public class Prog13 {
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);
        int input= scannerObj.nextInt();
        int a=0;
        scannerObj.close();

        if(input%2 == 0){
            for(int i=0; i<input/2-1; i++){
                a = a+6;               //for even numbers
            }
        }
        else{
            for(int i=0; i<input/2-1; i++){
                a= a+7;               //for odd numbers
            }
        }
        System.out.println(a);                   //prints the 15th term of the series if we give i/p value as 15
        }
    }

