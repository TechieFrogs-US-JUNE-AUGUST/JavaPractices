import java.util.Scanner;
class Area
{
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
    void setDim()
    {
        System.out.println("length is "+l);
        System.out.println("Breadth is "+b);
    }
    void getArea()
    {
      int Area=l*b;
      System.out.println("area of Rectangle in SQ units "+Area);
    }
    public static void main(String[] args)
     {
        System.out.println("enter length and bredth values");
        Area obj=new Area();
        obj.setDim();
        obj.getArea();
    } 
}