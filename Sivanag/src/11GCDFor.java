import java.util.Scanner;

class gcdnumbersFor
{
    public static void main(String args[])
    {
        
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int a = sc1.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc1.nextInt();

        int x=a;
        int y=b;
     
        for(;a!=b;)
        {
            if(a>b)
            a-=b;
            else
            b-=a;
        }
        System.out.println("GCD of " +x + " and " +y +" is: " +a);
        sc1.close();

    }


}