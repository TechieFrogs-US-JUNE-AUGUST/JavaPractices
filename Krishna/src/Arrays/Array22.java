public class Array22 
{
    public static void main(String args[])
    {  
         int a[][]={{1,3,4},{3,4,5}};                         //creating matrix a.  
         int b[][]={{1,3,4},{3,4,6}};                        //creating matrix b. 
         int c[][]=new int[2][3];                           //creating  matrix c to store the difference of two matrices  
    
        for(int i=0;i<2;i++)
        {  
            for(int j=0;j<3;j++)
            {  
                c[i][j]=a[i][j]-b[i][j];                //adding  2 matrices  

                System.out.print(c[i][j]+" ");          // printing the value of difference .
            }  
                System.out.println(); 
        }  
    }
} 