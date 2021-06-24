import java.util.Scanner;

class multiplicationtable1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Multiplication Table Number : ");
        int n = sc.nextInt();
        System.out.println("Enter Number of columns : ");
        int m = sc.nextInt();
        
            for(int j=1;j<=m;j++)
            {
                System.out.println(n + "*" +j +"="+(n*j));
            }
        sc.close();
    }

}