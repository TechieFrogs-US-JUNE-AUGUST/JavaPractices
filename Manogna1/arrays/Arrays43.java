package arrays;

import java.util.Scanner;

public class Arrays43 {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter the Specific Value :");
        int specificValue=scannerObj.nextInt();// from the user we are giving the value
        Arrays43 arrays=new Arrays43();//create ionstance of the class
        System.out.print(arrays.getSpecificValue(array, specificValue) );
        System.out.println();
        scannerObj.close();
    }

    public String getSpecificValue(int[] input,int element) //method to get specific value 
    {
        String flag=" No, The Given value is not in the Array"; //create a string
        for(int i=0;i<input.length;i++)
        {
            if(input[i]==element) // if the element is present 
            {
                flag="Yes , The Given value is Present in the Array";
                
            }
           
        }
        return flag;
    }
    
}
