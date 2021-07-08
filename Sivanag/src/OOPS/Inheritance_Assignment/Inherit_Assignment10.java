package Inheritance_Assignment;

import java.util.Scanner;



public class Inherit_Assignment10 {
    public static void main(String[] args)  {
        
        Banana bobj = new Banana();

    }
    
}
class Apple
{
    int number_of_items;
   
}
class Banana extends Apple
{
    int number_of_items;
    void show()
    {
        int j;
        System.out.println("Enter Number of Apples ");
    
        Scanner sc =new Scanner(System.in);
        
        super.number_of_items= sc.nextInt();
        System.out.println("Enter Number of Bananas ");
        number_of_items =sc.nextInt();
        j=super.number_of_items;
        System.out.println("Apple Number of Items : " + j);
        System.out.println("Banana Number of Items : " + number_of_items);
        sc.close();
    }
    Banana()
    {
        show();
    }

}