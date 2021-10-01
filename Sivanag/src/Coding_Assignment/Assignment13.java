package src.Coding_Assignment;

import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Enter first number of Collatz Series : ");
        int firstNum=scannerObj.nextInt();
        System.out.print("Enter to find the position of Series :");
        int pos =scannerObj.nextInt();
        int[] array =new int[pos];
        array[0]=firstNum;
        for(int i=1;i<pos;i++)
        {
            if(array[i-1]%2==0)
            {
                array[i]=array[i-1]/2;
            }else{
                array[i]=(3*array[i-1])+1;
            }      
        }
        System.out.println(pos + " th number of Series is: " + array[pos-1]);
        scannerObj.close();
    }
    
}
