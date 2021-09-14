import java.util.Scanner;
public class Coding19 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("N1 = ");
        int N1 = scannerObj.nextInt();
        System.out.print("N2 = ");
        int N2 = scannerObj.nextInt();        
        int number, oNumber; 
        //oNumber = number;       
        int temp, sum = 0;
        if(N1 < 0 || N2 < 0){ // we have to check the less than zero here itself
            System.out.println("Wrong Input");
        }else if(N1 < N2 ){
                //oNumber = number;
            //if(N1 > 100 && N2 < 200){
                System.out.print("enter the number");
                number = scannerObj.nextInt();
                oNumber = number;
                while(number != 0 ){
                    temp = number % 10;
                    sum += temp*temp*temp;
                    number /= 10;
                    
                }                       
                if(oNumber == sum)
                   System.out.println(oNumber);                     
        //}else if(N1 < 0 || N2 < 0){
        //   System.out.println("Wrong Input");
        }else 
            System.out.println("Wrong Input"); 
        scannerObj.close();
    }    
}
