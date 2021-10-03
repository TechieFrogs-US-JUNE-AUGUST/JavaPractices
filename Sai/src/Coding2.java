import java.util.Scanner;
public class Coding2 {
    public static void main(String[] args) {
        int trainees[][] = new int[3][3];
        Scanner scannerObj = new Scanner(System.in);
        int average[] =new int[3];
        int total = 0;
        System.out.println("Give the Oxygen Values of Trainees : ");
        for(int i = 0; i < trainees.length ; i++){
            for(int j = 0; j < trainees.length; j++){
                System.out.println("Oxygen Value of Trainee "+(i+1)+" in "+(j+1)+" round");
                trainees[i][j] = scannerObj.nextInt();//give oxygen levels as 95 92 95, 92 90 92, 90 92 90
            }
        }
        for (int i = 0; i < trainees.length; i++){
            for(int j = 0 ; j < trainees.length ; j++){
                if(trainees[i][j] > 0 && trainees[i][j] <=100){
                    total = total + trainees[i][j];
                }
                average[i] = total/3; //need to an array for an average, so we can save all 3 trainees 
            }
        }
        for(int i = 0; i < average.length; i++){
            if(average[i] > 70){
                System.out.println("Trainee Number "+(i+1)+" is a Good fit");
            }else 
              System.out.println("Trainee Number "+(i+1)+" is a Unfit");  
        }
        scannerObj.close();
        
    }
}
