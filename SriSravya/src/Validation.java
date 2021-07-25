import java.util.Scanner;

public class Validation {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int rows=0;
        do{
            System.out.println("Enter positive number of rows");
            while(!scan.hasNextInt()){                                         //until the scanner obj has number this loop repeats
                System.out.println("It is not a number.Please enter a number");
                scan.next();                                                   //scans for next token
            }
            rows=scan.nextInt();                    //if while is false then it means the i/p is int and it is scanned by scanner
        }while(rows<=0);                            //this process repeats until rows is less than 0
        scan.close();
    }
}
