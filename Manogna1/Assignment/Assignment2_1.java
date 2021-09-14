package Assignment;

//import java.util.Scanner;

public class Assignment2_1 {
        public static void main(String[] args) {
      // Scanner scannerObj=new Scanner(System.in);
       int array1[]={1,2,5,4,0};
       int array2[]={2,4,5,0,1};
       int sum1=0,sum2=0,pro1=1,prod2=1;
        int m=array1.length;
        int n=array2.length;
        if(n!=m)
        {
          System.out.println(("Both arrays are of different Length"));
        
        }
        else
        {
           for(int i=0;i<m;i++)
           {
            sum1=sum1+array1[i];
            pro1=pro1*array1[i];
            
           }
           System.out.println(sum1);
           System.out.println(pro1);
           for(int i=0;i<n;i++)
           {
               sum2=sum2+array2[i];
               prod2=prod2*array2[i];
           }
           System.out.println(sum2);
           System.out.println(prod2);

        }
        if(sum1==sum2 && pro1==prod2)
        {
            System.out.println("Yes");
        }
        else
       {
           System.out.println("No");
       }
        
    }
    
}

    
