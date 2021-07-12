package OOPS_assignment_Inheritance;
import java.util.Scanner;

class Circle1{                              //parent class
    double radius=1.0;
    String color="Red";
    double area;

    Circle1(){}                       //default constructor
    Circle1(double radius) {}         //constructor with single parameter
    Circle1(double radius,String color) {} //constructor with double parameters

    double getRadius(){               //mutator method to get Radius of Circle1
        return radius;
    }
    void setRadius(double radius) {}       //accessor method to set radius 

    String getColor() {                //mutator method to get color of Circle1
        return color;
    }
    void setColor(String color){}         //accessor method to set color

    void getArea(){                      //method for calculating Area of circle1
        area=(3.14*(radius*radius));
        System.out.println("Area: " +area); 
    }
} 
class Cylinder extends Circle1{                    //subclass with inheritance
double height=1.0;
double volume;
double radius;

Cylinder(){}                                //default constructor       
Cylinder(double radius){                     //constructor with single parameter
this.radius=radius;
}
Cylinder(double radius,double height){         //constructor with double parameters
this.radius=radius;
this.height=height;
}
Cylinder(double radius,double height,String color){     //constructor with  3 parameters
    this.radius=radius;
    this.height=height; 
    this.color=color;
}

double getHeight(){                   //method to get height of Cylinder
    return height;
}
void setHeight(double height){        //method to set the height
height=5.3;
}

void getVolume(){                     //method  to get the volume  
    volume = 3.14 * (radius * radius)*height;
    System.out.println("Volume of Cylinder is: " +volume);
}

void getArea(){                    //overriding method to get area of cylinder and it also has inheritance rltn
    double area;
    area = (2*3.14 * radius * height)+(2*3.14 *radius * radius);
    System.out.println("Surface Area is: " +area); 
  }

}
public class Ass3Prog11 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Radius of Circle1: ");
        double r=s.nextDouble();                         //creating obj for Circle1
        System.out.print("Enter Height of Cylinder: ");
        double h=s.nextDouble();                         //creating obj for cylinder
        Circle1 obj=new Circle1(r);        
        Cylinder obj1=new Cylinder(r,h);
        obj.getArea();                         //calling circle method
        obj1.getArea();                        //calling cylinder method with obj of cylinder
        obj1.getVolume();                      //calling cylinder method with obj of cylinder to get volume of cylinder
    }  
}