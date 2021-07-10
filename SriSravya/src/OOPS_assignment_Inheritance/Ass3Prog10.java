package OOPS_assignment_Inheritance;
import java.util.Scanner;
class Apple{                   
    int number_of_items;   
}
class Banana extends Apple{     //inheritance 
    int number_of_items;
    void show(){               //Method
        int i;
        Scanner s =new Scanner(System.in);                 

        System.out.println("Enter Number of Apples ");
        super.number_of_items= s.nextInt();                    //accessing super class mem with using super()
        System.out.println("Enter Number of Bananas ");
        number_of_items =s.nextInt();
        i=super.number_of_items;                       //assigning i with the i/p of parent class variable
        System.out.println("Apple Number of Items: " +i);
        System.out.println("Banana Number of Items: " +number_of_items);
    }
public class Ass3Prog10 {
    public static void main(String[] args) {
         Banana b = new Banana();                      //creating obj for subclass
         b.show();                                  //calling method with obj of subclass
    }   
  }
}
