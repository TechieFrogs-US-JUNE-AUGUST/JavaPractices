class RectangleArea{      
    int a,b,c;
    RectangleArea(int l , int w){   //creating an parameterized constructor
        a=l;
        b=w;
    }
    void area(){                  // creating method for calculating area
        c=a*b;
        System.out.println(c);      //printing the area
    }
    public static void main(String[] args){
        RectangleArea a1 = new RectangleArea(4,5);  //giving values for 1st rectangle
        System.out.print("Area of the Rectangle : ");
        a1.area();                  // calling method for 1st rectangle
        RectangleArea a2 = new RectangleArea(8,5);    // giving values for 2nd rectangle
        System.out.print("Area of the Rectangle : ");
        a2.area();                  // calling same method for 2nd rectangle
    }
}