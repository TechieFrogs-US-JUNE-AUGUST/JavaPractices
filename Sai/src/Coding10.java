import java.util.Scanner;
public class Coding10 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Number of patients : ");
        int patients = scannerObj.nextInt();
        System.out.println("Enter the ages of  Patients : ");
        //int patients = scannerObj.nextInt();
        int age[] = new int[patients];
        int i;
        int income = 0;
        if(patients > 0 && patients <= 20 ){
            for(i = 0; i < 20 ; i++){
                age[i] = scannerObj.nextInt(); // 20, 30, 40, 50, 2, 3, 14
            }
        }else{
            System.out.println("Invalid Input");
        }
        //scannerObj.close();    
        for(i = 0; i < age.length; i++){
            if(age[i] > 0 && age[i] <= 120){
                if(age[i] < 17 ){
                    income = income + 200;
                }else if(age[i] >= 18 && age[i] <40){
                    income = income + 400;
                }else if(age[i] >= 40){
                    income = income + 300;
                }
            }            
        }
        System.out.println("Total Income "+ income + " INR");
        scannerObj.close();
    }
}