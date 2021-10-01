package src.Assignment_Wipro;
import java.util.Scanner;
public class Assignment8 {
    static int integerInput()
    {
        Scanner scannerObj=new Scanner(System.in);
        int num;
        do{
            while(!scannerObj.hasNextInt())
            {
                System.out.print("Enter Positive Number:");
                scannerObj.next();
            }
            num = scannerObj.nextInt();
            
        }while(num<0 && num >Math.pow(10, 9));
        scannerObj.close();
        return num;
    }
    public static void main(String[] args) {
        System.out.print("Enter Application Id : ");
        int applicationId=integerInput();
        int temp=0,rmd,r=1;
        while(applicationId>0)
        {
            rmd=applicationId%10;
            if(rmd%2==0)
            rmd++;
            else
            rmd--;
            applicationId/=10;
            temp=temp+(rmd*r);
            r*=10;

        }
        System.out.println("Token Number is: " +temp);
        
    }
    
}
