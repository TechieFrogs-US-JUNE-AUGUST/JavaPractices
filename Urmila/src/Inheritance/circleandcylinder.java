package Inheritance;
import java.util.Scanner;
 class Circle {                              //parent class
        double radius=1.0;
        String color="Red";
        double area;
        private double π;
    
        Circle(){}                       
        Circle(double radius) {}         //constructor with single parameter
        Circle(double radius,String color) {} //constructor with double parameters
    
        double getRadius(){               //method to get Radius 
            return radius;
        }
        void setRadius(double radius) {}      
    
        String getColor() {                
            return color;
        }
        void setColor(String color){}         //accessor method to set color
    
        void getArea(){                      //method for calculating Area of circle
            area=3.14*(radius*radius);
            System.out.println("Area: " +area); 
        }
    } 
    class Cylinder extends Circle{                    //subclass with inheritance
    double height=1.0;
    double volume;
    double radius;
    private double π;
    
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
    void setHeight(double height){        //method to set height
    height=6;
    }
    
    void getVolume(){                     //method  to get the volume  
        volume = 3.14 * (radius * radius)*height;
        System.out.println("Volume of Cylinder is: " +volume);
    }
    
    void getArea(){                    //overriding 
        double area;
        area = ((2*3.14) * (radius * height))+2*(3.14 * (radius * radius));
        System.out.println("Surface Area is: " +area); 
      }
    
    }
    public class circleandcylinder {
        public static void main(String[] args)
        {
            Scanner s=new Scanner(System.in);
            System.out.print("Enter Radius of Circle = ");
            double r=s.nextDouble();                         //creating obj for Circle
            System.out.print("Enter Height of Cylinder: ");
            double h=s.nextDouble();                         //creating obj for cylinder
            Circle obj=new Circle(r,"Yellow");        
            Cylinder obj1=new Cylinder(r,h,"Blue");
            obj.getArea();                         //calling circle method
            obj1.getArea();                        //calling cylinder method with obj of cylinder
            obj1.getVolume();                      //calling cylinder method with obj of cylinder to get volume of cylinder
        }  
    } 

