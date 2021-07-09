 class Tri{                        //subclass
  int a,b,c,h=3;
  void getArea(){                     //method
    System.out.println("Area of triangle " +(0.5)*b*h);        
  }
  void getPerimeter(){                   //method
    System.out.println("Perimeter of triangle "+(a+b+c));
  }
public class Triangle3{
    public static void main(String[] args){
      Tri t=new Tri();                    //created instance object t
      t.a=3;
      t.b=4;
      t.c=5;
      t.getArea();                   //calling method
      t.getPerimeter();
    }
  }
}