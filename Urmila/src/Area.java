import java.util.Scanner;
public class Area {
    int lenght; 
    int breadth;
    public Area(int l, int b){
    }
    public int getArea(){
        return lenght*breadth;
    }
}
class AddArea{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int l,b;
System.out.println("Enter lenght");
l = s.nextInt();
System.out.println("Enter breadth");
b = s.nextInt();
Area a = new Area (l,b);
System.out.println("Area :"+ a.getArea());
    }
}