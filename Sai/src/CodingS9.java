import java.util.Scanner; // need to check one more time

public class CodingS9 {  //finding the last non-zero digit of factorial 
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = scannerObj.nextInt();
        System.out.println("Last non zero digit of the "+number + " is " +fact(number));
        scannerObj.close();
    }
    static int fact(int num){
        if(num > 9){
            if((num/10) % 2 != 0)
                return lastNonzero(4*fact(num/5)*fact(num%10));
            else
                return lastNonzero(6*fact(num/5)*fact(num%10));
        }else{
            int n1 = 1;
            for(int i = num; i > 0; i--){
                n1=n1*i;
            }
            return n1;
        }
    }
    static int lastNonzero(int num){
        while(num%10 == 0){
            num = num/10;
        }
        return num%10;

    }
    
}
