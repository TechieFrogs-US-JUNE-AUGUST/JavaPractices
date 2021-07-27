package OOPS_assignment_Inheritance;

class Rectangles1{
    int length, breadth;
     Rectangles1(int l, int b){            //constructor using parameters
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
public class Ass3Prog5 {
   public static void main(String[] args) {
    Rectangles1 obj=new Rectangles1(4,5);             //creating obj and passing the i/p to the constructor
    obj.Area();
    obj.Perimeter();

    Square s=new Square(4);
    s.Area();
    s.Perimeter();
     
    Square a[]= new Square[10];                //using array to print the area of 10 squares
    int k=5;                                   //declaring the i/p value as 5
    for(int i=0; i<10; i++){
        a[i]= new Square(k);                  
        k++;
    }
    for(int i=0; i<10; i++){
        a[i].Area();
        a[i].Perimeter();
    }
   } 
}
