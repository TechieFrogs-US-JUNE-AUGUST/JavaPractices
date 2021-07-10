package oops;

class Rectangle{

    Rectangle(int x,int y){
        System.out.println(Area(x,y));
    }
    int Area(int l,int b){
        return(l*b);
    }
    
}

public class AreaOfRectangle5 {
    public static void main(String[] args) {
        Rectangle area=new Rectangle(4,5);
        Rectangle area1=new Rectangle(5,8);
    }
    
}
