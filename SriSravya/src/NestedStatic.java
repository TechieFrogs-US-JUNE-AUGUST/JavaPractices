
//IN STATIC CLASSES WE DONT NEED TO CREATE OBJ FOR OUTERCLASS TO ACCESS INNER CLASS
//WE CANT ACCESS NON-STATIC ONES IN THE INNER CLASS
//WE CAN DIRECTLY ACCESS INNER CLASSES USING 'outerclassname.innerclass'
public class NestedStatic {
    int i;
    static int j=10;
    StaticInnerclass obj=new StaticInnerclass();      //we can directly create instance in the nestedstatic class for the innerclass here also         
    obj.show();
    void display(){
        System.out.println("Display");
    }
    public static class StaticInnerclass{      
        int k=20; 
        StaticInnerclass1 obj2=new StaticInnerclass1();
        obj2.show1();
       void show(){
            System.out.println("Show");
            System.out.println(+i);      //cannot access non-static variable
            //display();                 //only if we give 'static' to the outerclass method we can access that method in innerclass
                                      //if we need to access without giving static we need to create instance in the main class for the innerclass
        }
    }
        public static class StaticInnerclass1{
            int k=20;
            void show1(){
                System.out.println("Show1");
       }  
    }
    public static void main(String[] args) {   
        NestedStatic staticobj= new NestedStatic();
        staticobj.display();               
         NestedStatic.StaticInnerclass staticinnerobj=new NestedStatic.StaticInnerclass(); //higherclass.innerclass inerclassobj=new higherclass.innerclass
         staticinnerobj.show();             
    }
}
