package Practice;

import java.util.Scanner;

public class chk_integer_input {
    public static void main(String[] args) {
        System.out.println("Enter Input");
        Scanner scannerObj=new Scanner(System.in);
        int num;
        do
        {
            while(!scannerObj.hasNextInt())
            {
                //num=scannerObj.nextInt();
                System.out.println("Give Positive Number");
                scannerObj.next();    
            }
                num=scannerObj.nextInt(); 
                if(num==0)
                System.out.println("Please Enter Positive Number");
                         
        }while(num<=0);
        System.out.println(num);
        scannerObj.close();
    }
    
    
}
