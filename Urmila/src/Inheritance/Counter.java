package Inheritance;

class Counter  
{
   int i;
   void increment(){
      System.out.println("i  =" + i);
}    
}
 class Subclass extends Counter{
     void increment(){
         super.i=3;
         super.increment();
     }
 } 
 class AddCounter{
     public static void main(String[] args){
         Subclass subclass = new Subclass();
         subclass.increment();
     }
 }