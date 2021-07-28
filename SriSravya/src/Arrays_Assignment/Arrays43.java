//TO CHECK IF AN ARRAY CONTAINS GIVEN VALUE
package Arrays_Assignment;
import java.util.Scanner;

public class Arrays43 {
    public static void main(String[] args) {
        int array[]= {10,20,30,40,50};                        //initialisation
       // int number=30;
       Scanner scannerObj= new Scanner(System.in);            //using scanners to read the i/p from user
       System.out.println("Enter a number: ");
       int number= scannerObj.nextInt();
        boolean count= false;

        for(int i=0; i<array.length; i++){            //iterates through the array
            if(array[i] == number){                  //checks the condition if the entered number matches within the array
                count= true;                         //if the condition is true, count value changes to true
                break;
            }
        }
        if(count){
            System.out.println("Number " + number + " is found in the array");
        }else{
            System.out.println("Number " + number + " is not found in the array");
            scannerObj.close();
          }
     }
 }

