package Arrays;

import java.util.Scanner;

public class ArraysAssignment2 {
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("enter length of array");
        int length=scannerObject.nextInt();
        int array[]=new int[length];
        int frequency[]=new int[length];
        System.out.println("enter elemets in array");
        for(int i=0;i<length;i++)
        {
            array[i]=scannerObject.nextInt(); //enter elements in an array
            frequency[i]=-1;
        }
        
        for(int i=0;i<length;i++){
            int count=1;
            for(int j=i+1;j<length;j++){
                if(array[i]==array[j]){
                    count++;
                    frequency[j]=0;
                }
            }
            if(frequency[i]!=0){
                frequency[i]=count;
            }
        }
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]!=0){
                System.out.println("frequency of "+array[i]+" : "+frequency[i] );
            }
        }
        scannerObject.close();
    }
}
