package TcsCoding_Assignment;

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        int trainee[][]= new int[3][3];             //declaring an 2D array for 3 batch of trainees and 3 rounds
        int average[]= new int[3];                  //declaring a 1D array for the average of 3 rounds
        int max= 0;
        Scanner scannerObj= new Scanner(System.in); 
        System.out.println("Enter Oxygen Values: ");       
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                trainee[i][j]= scannerObj.nextInt();               //reading the oxyen values of the 3 trainees from the user
                if(trainee[i][j] < 1 || trainee[i][j] > 100){      //oxygen values should not be accepted if it is not in between 1 and 100
                   // System.out.println("INVALID INPUT");
                   trainee[i][j]= 0;
                }
            }
        }
        for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                   average[i]= average[i] + trainee[j][i];
                }
                average[i]= average[i] / 3;                   //for calculating the avg of 3 rounds  
        }
        for(int i=0; i<3; i++){
            if(average[i] > max){
                max= average[i];                            //for calculating the highest avg oxygen level of 3 trainees
            }
        }
        for(int i=0; i<3; i++){
            if(average[i] == max){                          //if the oxygen level of trainee is highest, displays the trainee num
                System.out.println("Trainee Number : " +(i+1));
            }
            if(average[i] < 70){                             //if the avg oxygen level is <70, they are unfit
                System.out.println("Trainee is Unfit");
            } 
        }
        scannerObj.close(); 
    }
}
