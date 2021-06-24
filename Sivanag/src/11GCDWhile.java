import java.util.Scanner;

class gcdnumbers
{
    public static void main(String args[])
    {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int a= sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b= sc.nextInt();
        int x=a;
        int y=b;
 
        while((a !=0) && a!=b && b!=0 )
       {
        if(a>b)
        {
            a=a % b;
        }
        else
        b=b % a;
       }
       if(b != 0)
        System.out.println("GCD of " +x + " and " +y +" is: " +b);
        else
        System.out.println("GCD of " +x + " and " +y +" is: " +a);

       sc.close();
    }


}