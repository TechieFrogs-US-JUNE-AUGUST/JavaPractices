public class Shape6 
{
    public static void main(String[] args)
    {
        Shape6 obj=new Shape6();
        Rectangle obj2=new Rectangle();
        obj.show();
        obj2.show();
    }
public void show()
{
    System.out.println("this is shape");
}
    }
     class Rectangle extends Shape6
    {
        public void show()
        {
            System.out.println("this is Rectangle");
        }

    }
     class Circle extends Shape6
    {
        public void show()
        {
            System.out.println("this is Circle");
        }

    public class Square
    {
        public void show()
    {
        System.out.println("Square is a rectangle");
    }
    }
}
    


