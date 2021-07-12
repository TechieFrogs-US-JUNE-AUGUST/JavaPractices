//NON_STATIC
//IT COMPLETLY DEPENDS UPON OUTERCLASS AND OUTERCLASS SCOPE
public class NestedNonStatic{
    private int i;
    static int y=10;        
    void display(){
        InnerClass innerobj=new InnerClass();   //to use innerclass from main nested class we can directly create instance
        innerobj.show();                            //no need to write in the main mandatorily
        NestedNonStatic.InnerClass.InnerClass2 innerobj2=innerobj.new InnerClass2();  //we can access innerclasses from methods aswell
        innerobj2.example();                 //we need to use syntax to access the variables/method of inner-->innerclasses
        System.out.println("In display");                             
    }
     protected class InnerClass{                        
        int j;  
        
         static void show(){
            InnerClass2 innerclass2obj=new InnerClass2();
            innerclass2obj.example();         //when we define some method with static we cannot create instance for the inner class in the method
            System.out.println("In show");
            System.out.println(i);             
            display();                        
        }
        public class InnerClass2{
            int k;
           
              void example(){
                System.out.println("Example");
                System.out.println(+y);
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
        NestedNonStatic obj=new NestedNonStatic();                //instance for outer class
        NestedNonStatic.InnerClass.InnerClass2 innerobj2=innerobj.new InnerClass2();  
        innerobj2.example();
    }
}  


