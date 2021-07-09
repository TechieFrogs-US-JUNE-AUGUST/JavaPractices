package OOPS_assignment_Inheritance;
class Rectangle{
    int length, breadth;
     Rectangle(int l, int b){            //constructor using parameters
        this.length=l;
        this.breadth=b;
    }
    public void Area(){                     //method to print area of rectangle
        System.out.println(length*breadth);
    }
    public void Perimeter(){                 //method to print perimeter of rectangle
        System.out.println(2*(length+breadth));
    }
}
class Square extends Rectangle{              //inheritance
    int side;
     Square(int s){                  //constructor using parameter
        super(s,s);              //calling parent class members using super
    }
}
public class Ass3Prog4 {
    public static void main(String[] args){
        Rectangle obj=new Rectangle(4,5);     //creating obj and passing the i/p to the constructor
        obj.Area();
        obj.Perimeter();

        Square s=new Square(4);
        s.Area();
        s.Perimeter();
    }
}
