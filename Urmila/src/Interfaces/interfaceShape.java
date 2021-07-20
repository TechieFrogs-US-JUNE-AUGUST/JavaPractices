package Interfaces;

    interface Circles{
        void getRadius();
        void getColor();
      }
      interface Rectangles{
          void getLength();
          void getWidth();
          void getColor();
      }
      interface Shapes{
          String Shape();
      }
      interface Signs{
          String sign();
      }
      class Circle implements Circles {
          Circle(){}
          double radius;
          String color;
          Circle(double radius, String color) {
              this.radius = radius;
              this.color = color;
          }
      
          public void getRadius() {
              double radius = 10;
              System.out.println("radius of a circle:" + radius);
          }
      
          public void getColor() {
              String color = "red";
              System.out.println("color of a circle:"+color);
          }
      }
      class Rectangle implements Rectangles{
          Rectangle(){}
          double length;
          double width;
          String color;
          Rectangle(double width,double length,String color){
              this.length=length;
              this.width=width;
              this.color=color;
          }
          public void getWidth(){
              double width=7;
              System.out.println("width of a rectangle:"+width);
          }
          public void getLength(){
              double length=9;
              System.out.println("length of a rectangle:"+length);
          }
          public void getColor(){
              String color="white";
              System.out.println("color of a rectangle:"+color);
          }
      }
      class ShapeA implements Shapes{
          ShapeA(){}
              String shapeB;
              ShapeA(String sh){
                  shapeB=sh;}
              public String Shape() {
                  String shape = "circle is a Shape";
                  System.out.println("the size of the String is:"+shape.length());
                  return shape;
              }
      }
      class Sign implements Signs{
          String sign;
          Sign(){}
          Sign(String sign){
              this.sign=sign;
          }
          public String sign() {
                  String sign="@";
                  System.out.println("sign assigned to circle is:"+sign);
                  return sign;
              }
          }
 class AddinterfaceShape {
      public static void main(){
          Circle circle = new Circle();
          circle.getRadius();
          circle.getColor();
          Rectangle rectangle=new Rectangle();
          rectangle.getLength();
          rectangle.getWidth();
          rectangle.getColor();
          ShapeA shapeA=new ShapeA();
          shapeA.Shape();
          Sign sign=new Sign();
          sign.sign();
      }
      }
    
}
