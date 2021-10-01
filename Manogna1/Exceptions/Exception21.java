package Exceptions;

import java.util.Scanner;

public class Exception21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,i;
        a=sc.nextInt();
        int array[]=new int[a];
        try{
          for(i=0;i<a;i++)
            {
                array[i]=sc.nextInt();
            }
            System.out.println(array[0]);
            array[1]=30/0;
           
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(ArithmeticException ae)
        {
           array[1]=30/3;
           System.out.println(array[1]);
        }
        catch(Exception e)
        {
            System.out.println("Exception Occurs");
        }
        finally{
            sc.close();
        }
        System.out.println("Rest of the code");
    }
    
}
