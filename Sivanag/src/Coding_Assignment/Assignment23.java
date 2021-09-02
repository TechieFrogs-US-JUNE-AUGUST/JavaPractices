package src.Coding_Assignment;
import java.util.Scanner;
public class Assignment23 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.print("Enter from Number : ");
        int from =scannerObj.nextInt();
        System.out.print("Enter to Number : ");
        int to =scannerObj.nextInt();
        for(int i=from;i<=to;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("usbdevice");
            }else if(i%3==0)
                System.out.println("usb");
                else if(i%5==0)
                System.out.println("device");
                else
                System.out.println(i);
        }

        scannerObj.close();
    }
    
}
