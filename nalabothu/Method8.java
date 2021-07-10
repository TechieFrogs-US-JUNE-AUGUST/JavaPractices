public class Method8
 {
    public static void main(String[] args)
        {
           Method8 obj=new Method8();
           B obj2=new B();
           obj.print();
           obj2.print();
        }
       public  static void print()
        {
            System.out.println("parent");
        }
    }
        class B
        {
           public  void print()
            {
                System.out.println("child");
             }
        }
       
    

