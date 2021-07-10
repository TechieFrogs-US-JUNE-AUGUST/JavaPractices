public class Rectangle {
    int lenght;
    int breadth;
    public Rectangle(int l, int b){
        lenght = l;
        breadth = b;
    }
    public int getArea(){
        return lenght*breadth;
    }
    public int getPerimeter(){
return 2*(lenght+breadth);
    }
}
class AddRectangle{
    public static void main(String[] args){
        Rectangle a = new Rectangle(4,5);
        Rectangle b = new Rectangle(5,8);
        System.out.println("Area:" +a.getArea()+"Perimeter is" + a.getPerimeter());
        System.out.println("Area:" +b.getArea()+"Perimeter is" + b.getPerimeter());
    }
}