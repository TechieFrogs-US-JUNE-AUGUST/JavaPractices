
/* public class ObjectsAndMethods {

        int i=5;
        String name="Sravya";
      void practice(){                            //method with no arguments
          System.out.println("This is method calling");
      }

    public static void main(String[] args){
        System.out.println("This is main");
        ObjectsAndMethods s= new ObjectsAndMethods();
        System.out.println(s.i);
        System.out.println(s.name);
        s.practice();      //method calling
       // System.out.println("This is test");   
    }  
}     */


/* public class ObjectsAndMethods {

    static int i=5;
    String name="Sravya";
 
public static void main(String[] args){
    System.out.println("This is main");
    ObjectsAndMethods s= new ObjectsAndMethods();
    System.out.println(s.i);
    System.out.println(s.name);
    int i=10;
    ObjectsAndMethods s1= new ObjectsAndMethods();     //creating second object
    s1.i=10;
    System.out.println(s1.i);
    
}  
}   */



/*  class SubClass{
    int a=100;
    //void practice(){
       // System.out.println("This is subclass");
       // System.out.println("a value" +a);
    //}
}
public class ObjectsAndMethods {

       int i=5;
       String name="Sravya";
      void practice(){
          System.out.println("This is method calling");
      }
    public static void main(String[] args){
        System.out.println("This is main");
        ObjectsAndMethods s= new ObjectsAndMethods();
        System.out.println(s.i);
          SubClass sample=new SubClass();
          System.out.println(sample.a);
         //sample.practice();
        
    }  
}       */
  


/*  public class ObjectsAndMethods {

        static int i=5;
        static void practice(int i){                      //method with arguments
          System.out.println("This is method calling");
          System.out.println(+i);
      }

    public static void main(String[] args){
        practice(i);      //method calling
    }
}      */



/*  public class ObjectsAndMethods{
    public static void main(String [] args){
      int x=1,y=2;
      int z=add(x,y);
      System.out.println("z value is " +z);
    }
    public static int add(int a, int b){
     int s;
     s=a+b;
     return s;
    }
}   */


public class ObjectsAndMethods{
    public static void main(String[] args){
        ObjectsAndMethods obj=new ObjectsAndMethods();
        System.out.println("Sum is " +obj.add(1,2));               //instance method calling
    }
    public int add(int a, int b){
        int s;
        s=a+b;
        return s;
    }
}

