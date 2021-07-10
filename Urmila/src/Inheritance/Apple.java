package Inheritance;
import java.util.Scanner;
class Apple {
int number_of_items;
}
class Banana extends Apple{
    int number_of_items;
    void show(){
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of Apples");
        super.number_of_items= s.nextInt();
        System.out.println("Enter the number of Bananas");
        number_of_items =s.nextInt();
        i=super.number_of_items;                       
        System.out.println("Apple Number of Items: " +i);
        System.out.println("Banana Number of Items: " +number_of_items);
    }
class AddApple {
    public static void main(String[] args) {
         Banana b = new Banana();                      //creating obj for subclass
         b.show();                                  //calling method 
    }   
  }
} 