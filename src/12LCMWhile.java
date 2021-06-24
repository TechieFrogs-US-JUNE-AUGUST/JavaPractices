import java.util.Scanner;

class lcmwhile
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b= sc.nextInt();
        int m;
        if(a>b)
        m=a;
        else
        m=b;
        while(true)
        {
            if ((m%a==0) && (m%b==0))
            {    System.out.printf("LCM of %d  and %d is %d. \n",a,b,m);
                 System.out.printf("GCD of %d  and %d is %d. \n",a,b,((a*b)/m));
                break;
            }
            m++;
        }

        sc.close();
//lcm
//jjj

    }


}