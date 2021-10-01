import java.util.Scanner;

public class Exception8Overload {
    static void Checking(int num)throws Exception{
            System.out.println("this is parent");
     }
    public static void main(String args[]) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("give num value");
        int num;
        try {
            num = scannerObj.nextInt();
            System.out.println(num);
            Checking(num);
                
        } catch (Exception e) {
            System.out.println("from catch block");
            e.printStackTrace();
        } finally{
            scannerObj.close();
        }
    }
} 
