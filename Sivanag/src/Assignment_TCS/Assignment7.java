

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("Enter number of Monkey on the Tree :");
        int n=scannerObject.nextInt();
        int k=scannerObject.nextInt();
        int j=scannerObject.nextInt();
        int m=scannerObject.nextInt();
        int p=scannerObject.nextInt();
        int s,t;
        if(m%2!=0)
           s=(m/k)+1;
           else
           s=m/k;
        if(p%2!=0)
            t=(p/j)+1;
            else
            t=p/j;

        System.out.println("Number of Monkeys on the Tree is :" +(n-(s+t)));


        scannerObject.close();

    }
    
}
