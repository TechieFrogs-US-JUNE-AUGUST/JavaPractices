import java.util.Scanner;
public class Circle11
 {
   static double radius=1;
    String color="red";
    double area;
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter radius:");
         double r=sc.nextDouble();
         System.out.println("enter height");
         double h=sc.nextDouble();
         Circle11 obj=new Circle11(r);
         Cylinder obj1=new Cylinder(r,h);
         obj1.getArea();
         obj1.getVolume();
         obj.getArea();
     }
    
Circle11()
 {

 }
 Circle11(double radius)
 {
    
 }
 Circle11(double radius,String color)
 {

 }
 double getRadius()
 {
     return radius;
 }
   void setRadius(double radius) 
   {

   }
   String getColor()
   {
       return color;
   }
   void setColor(String color)
   {

   }
   double getArea()
       {
           area=(3.14*(radius*radius));
           System.out.println("area: " +area);
           return area;
       }

       class Cylinder extends Circle11
   {
       double height=1;
       double volume;

Cylinder()
{

}
Cylinder(double height)
{
   System.out.println("the height is " +height);
}
Cylinder(double radius,double height)
{

}
Cylinder(double radius,double height,String color)
{

}
double getHeight()
{
    return height;
}
void setHeight(double height)
{

}
double getVolume()
{
    volume=3.14*(radius*radius)*height;
    System.out.println("volume of cylinder is" +volume);
    return volume;
}
double getArea()
{
    double area;
    area=((2*3.14)*(radius*height)+(3.14*radius*radius));
    System.out.println("surface area: " +area);
    return area;
}
   }
}





