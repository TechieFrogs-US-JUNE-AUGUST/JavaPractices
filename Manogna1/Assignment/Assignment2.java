package Assignment;

import java.util.Arrays;

//import java.util.Scanner;

public class Assignment2 {
    static boolean twoArrEqual(int array1[],int array2[])
    {
       
        boolean flag=true;
        int m=array1.length;
        int n=array2.length;
        if(n!=m)
        {
            flag=false;
            return flag;
        }
        else 
        {
            Arrays.sort(array1);
            Arrays.sort(array2);
            for(int i=0;i<m;i++)
            {
                System.out.print(array1[i]);
                
            }
            System.out.println();
            for(int i=0;i<m;i++)
            {
                System.out.print(array2[i]);
               
            }
            
            System.out.println();
            for(int i=0;i<n;)
            {
                
                if(array1[i]== array2[i])
                {
                    flag=true;
                    return flag;
                }
                
                else
                {
                    flag=false;
                    return flag;
                }
                
                
            }
        }
        return flag;
   
    }
    public static void main(String[] args) {
       //Scanner scannerObj=new Scanner(System.in);
       int array1[]={1,7,1};
       int array2[]={1,7,1};
       if(twoArrEqual(array1, array2))
       {
           System.out.println("yes");
       }
       else
       {
           System.out.println("No");
       }
     
        
    }
    
}
