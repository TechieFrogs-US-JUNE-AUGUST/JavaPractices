package Interfaces;

    interface Classone
    {  //interface 1                           //interface1
        void oneA();    // creating method                      //abstract method
        void oneB();
    }
    interface Classtwo
    {    // interface 2                        
        void twoA();
        void twoB();
    }
    interface Classthree
    {    // interface 3                     
        void threeA();
        void threeB();
    }
    interface Classfour extends Classone,Classtwo,Classthree
    { //inherits from above three classes             
        void fourA(); 
    }
    class newClass //creating newclass(concrete class)
    {}        
    class Newclass2 extends newClass implements  Classfour
    {
       public void oneA()
       {                         
           System.out.println("oneA");
       }
       public void oneB()
       {                            //overriding
           System.out.println("oneB");
       }
       public void twoA(){
           System.out.println("twoA");
       }
       public void twoB(){
           System.out.println("twoB");
       }
       public void threeA(){
           System.out.println("threeA");
       }
       public void threeB(){
           System.out.println("threeB");
       }
       public void fourA(){
           System.out.println("fourA");
       }
     }

class Addinterfaces6
{
        public static void main(String[] args)
        {
            Newclass2 newclass2 = new Newclass2();         //creating obj for subclass
            newclass2.oneA();
            newclass2.oneB();
            newclass2.twoA();
            newclass2.twoB();
            newclass2.threeA();
            newclass2.threeB();
            newclass2.fourA();
                                        
        }

}