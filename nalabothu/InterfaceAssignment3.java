package Interfaces;

import Interface.InterfaceDemo1.MyInterface;

public class InterfaceAssignment3 implements MyInterface
{
    public void fruits() {
        System.out.println("this is mango");
    }

    public void vegetables() {
        System.out.println("this is carrot");

    }
    public static void main(String[] args)
    {
        InterfaceAssignment3 i= new InterfaceAssignment3();
        i.fruits();
        i.vegetables();
 } 
}
