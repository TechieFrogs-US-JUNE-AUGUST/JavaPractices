

/*public class NestedClasses {
   private int i;          
   void display(){
       System.out.println("In display");
     //  show();                              //it can't be accessed as show is from the inner class i.e, from bottom to top it doesn't allow
   } 
    protected class InnerClass{                        //The inner class can be considered as a member of main class
       int j;                                          //so we can give public, default,protected,static etc
       void show(){
           System.out.println("In show");
           System.out.println(i);             //we can access i value if its private also
           display();                         //display method can also be accesses as its nested from top level to bottom
       }
   }
   private class InnerClass1{
       int z;
       void display(){
           System.out.println("In inner display");
       }
   }
}   */


public class NestedClasses {
    public final String innerobj = null;
    private int i;          
    void display(){
        System.out.println("In display");                             
    }
     protected class InnerClass{                        
        int j;                                         
        void show(){
            System.out.println("In show");
            System.out.println(i);             
            display();                        
        }
        public class InnerClass2{
            int k;
            void example(){
                System.out.println("Example");
            }
        }
    }
       private class InnerClass1{
        int z;
        void display(){
            System.out.println("In inner display");
        }
    }
    public static void main(String[] args) {
        NestedClasses obj=new NestedClasses();                //instance for outer class
        NestedClasses.InnerClass innerobj=obj.new InnerClass(); //instance for innerclass
        //syntax will be ' outerclass.innerclass innerobj=outerobj.new innerclass '
        innerobj.show();                                        //we are able to access inner class method
        NestedClasses.InnerClass1 innerobj1=obj.new InnerClass1();
        innerobj1.display();
        System.out.println(+innerobj1.z); 
        NestedClasses.InnerClass.InnerClass2 innerobj2=innerobj.new InnerClass2();  //higherclass.higherclass.existingclass existingobj=prefix_higherclass_obj.new existingclass
        innerobj2.example();
        System.out.println(+innerobj2.k);
    }
}  