package WiproAssignment;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        int numdimension=scannerObj.nextInt();
        int dims[]=new int[numdimension];
        for(int i=0;i<numdimension;i++)
        {
            dims[i]=scannerObj.nextInt();
        }
        scannerObj.close();
        int count=0;
        for(int i=0;i<numdimension;i++)
        {
            if(Math.cbrt(dims[i])==(int)Math.cbrt(dims[i]))
            {
                count++;
            }
        }
        System.out.println(count);

    }
    
}
