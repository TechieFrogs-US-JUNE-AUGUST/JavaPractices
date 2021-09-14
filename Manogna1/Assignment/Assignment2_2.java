package Assignment;



public class Assignment2_2 {
    static Boolean twoArrEqual(int array1[],int array2[])
    {
        boolean flag =true;
        int sum1=0,sum2=0,pro1=1,prod2=1;
        int m=array1.length;
        int n=array2.length;
        if(n!=m)
        {
            flag=false;
            return flag;
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
           if(sum1==sum2 && pro1==prod2)
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
        //return flag;
    }
    public static void main(String[] args) {
       //Scanner scannerObj=new Scanner(System.in);
       int array1[]={1,7,0};
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

