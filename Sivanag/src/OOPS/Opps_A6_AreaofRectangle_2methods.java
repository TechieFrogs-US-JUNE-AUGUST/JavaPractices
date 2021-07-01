import java.util.Scanner;



class Area1{
    void setDim()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Leangth of Rectangle :  ");
        int l=sc.nextInt();
        System.out.print("Enter Width of Rectangle :  ");
        int b=sc.nextInt();
        System.out.println("Area of Rectangle : " +getArea(l, b));
        sc.close();
    }
    int getArea(int l,int b)
    {
        return (l*b);


    }


}

public class Opps_A6_AreaofRectangle_2methods
{
public static void main(String[] args) {
    Area1 ae =new Area1();
    ae.setDim();
    
}


}