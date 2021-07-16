import java.util.Scanner;
public class Area1{     
    void setDim(){           //method for giving dimensions
        Scanner dim = new Scanner(System.in);        //open the scanner
        System.out.print("Give the rectangle length : ");
        int length=dim.nextInt();            // giving the input value for length
        System.out.print("Give the rectangle width : ");
        int width=dim.nextInt();              // giving the input value for width
        System.out.println("Area of Rectangle : " +getArea(length, width)); //calling the method for area
        dim.close();
    }
    int getArea(int length,int width){ // method for calculating the area
        return(length*width);          // calculating the area by lenth and width
    }
    public static void main(String[] args){
        Area1 Obj = new Area1();       // creating instance
        Obj.setDim();                //calling method to get dimension
    }
}
            