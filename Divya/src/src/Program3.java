public class Program3 {
    void area(int length,int breadth){
        System.out.println("Area of rectangle:"+(length*breadth));
    }
    void area(int side){
        System.out.println("Area of a square:"+(side*side));
    }
    public static void main(String[] args){
        Program3 obj1=new Program3();
        obj1.area(3,7);
        obj1.area(3);
    }
}
