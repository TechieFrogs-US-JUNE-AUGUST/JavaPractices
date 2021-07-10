interface Shape
{
    public void getPrint();
}
    class Rectangle implements Shape
    {
        public void getPrint()
        {
            System.out.println("Rectangle shape");
        }

    }


public class SampleInterface 
{
    public static void main(String[] args)
    {
        Shape s=new Rectangle();
        s.getPrint();
    }
    
}
