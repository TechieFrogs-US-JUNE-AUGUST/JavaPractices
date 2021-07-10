package Methods;

public class Degree 
{
     void getDegree()
     {
        System.out.println("i got a degree");
     }
}
    class Undergraduate
    {
        void display()
        {
            System.out.println("I am an Undergraduate");
        }
    }
    class Postgraduate
    {
        void display()
        {
            System.out.println("I am a Postgraduate");
        }
//public class Degree{   
         public static void main(String[] args)
            {
                Degree Obj= new Degree();
                Obj.getDegree();
                Undergraduate Obj1= new Undergraduate();
                Obj1.display();
                Postgraduate Obj2 = new Postgraduate();
                Obj2.display();
            }   
    }