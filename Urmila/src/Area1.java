
public class Area1 {
  int lenght, breadth;
  Area1(int l, int b){
public int setDim(){
    int results = lenght*breadth;
    return results;
}
public void getArea(){
    System.out.println("Area1 =" + setDim());
}
public static void main(String[]args){
    Area x = new Area(6,5);
    x.getArea();
  }  
}
public class  Area1{
    public static void main(String[] args){
        Area1 a = new Area1(4,5);
        a.setDim();
    }

class AddArea1{
    public static void main(String[] args){
    int lenght,breadth;
    Area1(int l,int b)
    {
lenght =l;
breadth = b;
int display =lenght*breadth;
System.out.println(display);
    }
}