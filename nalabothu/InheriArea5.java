 class InheriArea5 {
    int length;
    int breadth;
    public static void main(String[] args)
    {
        InheriArea5 obj=new InheriArea5();
        Square obj2=new Square();
        obj.InherArea5(5,6);
        obj.area();
        obj.perimeter();
        obj2.Square(1,2);
    }
    public InheriArea5()
    {

    }
public InheriArea5(int length,int breadth)
    {
        System.out.println("the length value is"+length);
        System.out.println("the breadth value is"+breadth);
    }
    public void area()
        {
            int area=length*breadth;
            System.out.println("area of rectangle is"+area);
        }
        public void perimeter()
        {
            int perimeter=2*(length+breadth);
            System.out.println("perimeter of rectangle is"+perimeter);
        }
    }
class Square extends InheriArea5
{
    public Square(int a,int s)
    {
        int area=s*s;
        System.out.println("area of Square is"+area);
        int perimeter=4*a;
        System.out.println("perimeter of square is"+perimeter);
    }

}

    
    

