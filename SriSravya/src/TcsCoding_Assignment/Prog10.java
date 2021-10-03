package TcsCoding_Assignment;

import java.util.Scanner;

public class Prog10 {
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);
        System.out.println("Enter the age of the patient: ");
        String age[]= new String[20];                      //declaring a string with size 20 patients
        int fees= 0;
        for(int i=0; i<age.length; i++){                  //traverse through this loop to enter the age of patients
            age[i]= scannerObj.nextLine();
            if(age[i]=="\n")                             //pressing enter to stop from entering the age values
            {
                break;
            }
        }
        scannerObj.close();
        for(int i=0; i<age.length; i++){
            if(Integer.parseInt(age[i]) == 0 || Integer.parseInt(age[i]) >= 120){       //if age is 0 and greater than 120 then it is invalid input 
                System.out.println("INVALID INPUT");
            }
            else if(Integer.parseInt(age[i]) < 17){
                fees= fees+200;
            }
            else if(Integer.parseInt(age[i]) > 17 && Integer.parseInt(age[i]) < 40){
                fees= fees+400;
            }
            else if(Integer.parseInt(age[i]) > 40){
                fees= fees+300;
            }
            System.out.println("Total Income " +fees + "INR");
        } 
    }
}
