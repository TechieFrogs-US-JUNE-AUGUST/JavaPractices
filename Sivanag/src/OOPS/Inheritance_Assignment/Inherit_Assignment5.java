package Inheritance_Assignment;

public class Inherit_Assignment5 {

    public static void main(String[] args) {
       // double[] u = new double[10];
        double u[]={10,20,30,40,50,60,70,80,90,100};
        for(int k=0;k<u.length;k++)
        {
        System.out.println("Area and Perimeter of Square " +(k+1) + " is ");
        Square sqr =new Square(u[k]);
        }
    }
    
}
