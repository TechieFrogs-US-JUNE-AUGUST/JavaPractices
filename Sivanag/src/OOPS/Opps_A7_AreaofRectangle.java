

import java.util.Scanner;

class Area
{
    void returnArea(int l,int b)
    {
    System.out.println("Area of Rectangle is : " + (b*l));
    }
Area(int l,int b)
{
    returnArea(l,b);
}
}

public class Opps_A7_AreaofRectangle {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter Leangth of Rectangle :");
    int l = sc.nextInt();
    System.out.println(" Enter Base of Rectangle :");
    int b = sc.nextInt();
    Area ar = new Area(l, b);

sc.close();
}

    
}
