package oops;

import java.util.Scanner;

class Area1{
    void setDim(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of the Rectangle");
        int l= sc.nextInt();
        System.out.println("Enter Breath of the Rectangle");
        int b= sc.nextInt();
        System.out.println("Area of Rectangle " +getArea(l,b));
    }
    int getArea(int l,int b){
    return(l*b);
    }
  }

public class AreaOfRectangleTwoMethods6 {
    public static void main(String[] args) {
        Area1 obj=new Area1();
        obj.setDim();

    }
    
}
