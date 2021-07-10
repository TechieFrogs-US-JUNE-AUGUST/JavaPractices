import java.util.Scanner;
public class Area6 
{
int l;
int b;
int area;
Scanner sc=new Scanner(System.in);

void setDim()
{
    l=sc.nextInt();
b=sc.nextInt();
    System.out.println("length is"+l);
    System.out.println("breadth is"+b);
}    
void getArea()
{
area=l*b;
System.out.println("area is"+area);
}
public static void main(String[] args)
{
    System.out.println("enter lngth and breadth values");
    Area6 c=new Area6();
    c.setDim();
    c.getArea();
}
}