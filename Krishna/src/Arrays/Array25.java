
public class Array25 
{
    public static void main(String args[])
    {  
         int a[][]={{1,3,4},{3,4,5}};                         //creating matrix a.  
         int b[][]={{1,3,4},{3,4,5}};                        //creating matrix b.  
         int temp=1;                                        // initializing temp variable to store the compared value of the elements .
         
        for(int i=0;i<a.length;i++)                        
        {  
            for(int j=0;j<b.length; j++)
            {  
               if( a[i][j]!=b[i][j])               //compares elements of a with elements of b.if the condition fails then it go to inner loop.
               {
                 temp = 0;                          // if contents of a,b are not equal then temp value is changed to 0 .
                break;                             // if contents of a,b are not equal then there is no need for futher checking 
               }
            }
        }
                if(temp==1)
                {
                    System.out.println("both are equal");    
                }
                else
                {
                    System.out.println("both are not equal ");
                }
     }
} 