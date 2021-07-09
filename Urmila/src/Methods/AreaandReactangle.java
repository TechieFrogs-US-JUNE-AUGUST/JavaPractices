package Methods;

public class AreaandReactangle {

public void AreaofSquare( int x){
    System.out.println("Area of Square :" + x*x);
}
public void AreaofRectangle(int l,int b){
    System.out.println("Area of Rectangle :" + l*b);
}    
}
class AddAreaandRectangle{
    public static void main(String[] args){
        AreaandReactangle areaandrectangle = new  AreaandReactangle();
        areaandrectangle.AreaofSquare (5);
        areaandrectangle.AreaofRectangle (6,3);
    
    }
}