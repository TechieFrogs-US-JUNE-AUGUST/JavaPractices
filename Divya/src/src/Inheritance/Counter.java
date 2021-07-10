package Inheritance;

  class Counter1 {
    int i=3;
    void increment(){
        System.out.println("i="+i);
    }
}
class subCounter extends Counter1{
    void increment1(){
        super.i=3;
        super.increment();
    }
}
 class Counter{
      public static void main(String[] args){
          subCounter obj=new subCounter();
          obj.increment1();
      }
}