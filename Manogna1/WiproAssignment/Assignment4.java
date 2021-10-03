package WiproAssignment;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        System.out.print("Enter Barcode Number of Cosmotics: ");
        Scanner scannerObj=new Scanner(System.in);
        int barcode=scannerObj.nextInt();
        int num=barcode;
        int temporary;
        while(barcode>0)
        {
            temporary=barcode%10;
            if(temporary<num)
            {
                num=temporary;
                barcode=barcode/10;
            }
        }
        System.out.println("ID of oldest product in the batch is : " +num);
        scannerObj.close();
    }
    
}
