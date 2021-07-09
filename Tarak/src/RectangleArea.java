class Rectangle{
    int l,b,Area;
Rectangle(int l, int b){
    
    Area=l*b;
    System.out.println("Area in SQ units "+Area);
    System.out.println("length is "+l);
    System.out.println("breadth is "+b);
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        Rectangle obj=new Rectangle(4,5);
        Rectangle obj1=new Rectangle(5, 8);
    }
}
