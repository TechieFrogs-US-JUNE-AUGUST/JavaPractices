import java.util.Scanner;
class Add2Integers1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Integer : ");
        int x = sc.nextInt();
        System.out.println("");
        System.out.print("Enter second Integer : ");
        int y= sc.nextInt();
        
        System.out.println("sum of x and y is : " + (x+y) );
        sc.close();
    }

}