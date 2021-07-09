package Inheritance;
class Rectangle {
    int lenght;
    int breadth;Rectangle(int l,int b){
        this.lenght=l;
        this.breadth = b;
    }
    void Area(){
        System.out.println("Area = " + (lenght*breadth));
    }
    void Perimeter(){
        System.out.println("Perimeter="+ 2*(lenght+breadth));
    }
}
class Square1 extends Rectangle{
    int side;
    Square1(int s)
{
    super(s,s);
}
}
class AddRectangle{
    public static void main(String[] args){
Rectangle rectangle= new Rectangle(6,8);
rectangle.Area();
rectangle.Perimeter();
Square1 square1 = new Square1(6);
square1.Area();
square1.Perimeter();
  }
}