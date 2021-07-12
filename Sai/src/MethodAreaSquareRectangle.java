class Overload{
    void area(float x){
        System.out.println("the area of the square is : "+ x*x);
    }
    void area(float x, float y){
        System.out.println("the area of the rectangle is : "+ x*y);
    }
}
class MethodAreaSquareRectangle{
     public static void main(String args[]) {
	   Overload ob = new Overload();
	   ob.area(5);
	   ob.area(11,6);  
    }
}