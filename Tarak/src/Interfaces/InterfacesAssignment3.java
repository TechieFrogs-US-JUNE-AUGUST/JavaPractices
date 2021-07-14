package Interfaces;

import Methods.InterfaceDemo;

public class InterfacesAssignment3 implements InterfaceDemo {
   public void fruits(){
System.out.println("apple");
   }
   public void vegetables(){
       System.out.println("potato");
   }
   public static void main(String[] args) {
       InterfacesAssignment3 i=new InterfacesAssignment3();
       i.fruits();
       i.vegetables();
   }
}
