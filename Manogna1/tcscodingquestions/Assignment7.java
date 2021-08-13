package tcscodingquestions;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Total Number of Monkeys :");
        int n=scannerObj.nextInt();
        System.out.println("Number of eatable Bananas by Single Monkey ");
        int k=scannerObj.nextInt();
        System.out.println("Number of eatable Peanuts by Single Monkey ");
        int j=scannerObj.nextInt();
        System.out.println("Total number of Bananas");
        int m=scannerObj.nextInt();
        System.out.println("Total number of Peanuts");
        int p=scannerObj.nextInt();
        int ateB=0,ateP=0;
        if(n<0 || k<0 || j<0 || m<0 || p<0)
        {
            System.out.println("Invalid Input");
        }
        else 
        {
            if(k>0)
            ateB =(m/k);
            if(j>0)
            ateP=(p/j);
            n=n-ateB-ateP;
            System.out.println("Number of monkeys left on the tree  " +n);

        }
        scannerObj.close();

    }
    
}
