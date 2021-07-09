import java.util.Scanner;
public class Average {
int a;
int b;
int c;
int sum;
int average;
Scanner sc=new Scanner(System.in);

 Average()
{
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
    System.out.println("a value  is"+a);
    System.out.println("b  value is"+b);
    System.out.println("c value is "+c);
}    
void getSum()
{
sum=a+b+c;
average =sum/3;
System.out.println("average is"+average);
}
public static void main(String[] args)
{
    System.out.println("enter a,b,c values");
    Average c=new Average();
    c.getSum();
}
}