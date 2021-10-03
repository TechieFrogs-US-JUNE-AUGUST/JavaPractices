import java.util.Scanner;

public class Assignment2 {
    
    static int integerInput()
    {
        Scanner scannerObj=new Scanner(System.in);
        int num;
        do{
            //System.out.print("Enter Number : ");
            while(!scannerObj.hasNextInt())
            {
                System.out.print("Enter Positive Number:");
                scannerObj.next();
            }
            num = scannerObj.nextInt();
            
        }while(num<0);
        //scannerObj.close();
        return num;
    }
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        int num=integerInput();
        int[] price=new int[num];
    for(int i=0;i<num;i++)
    {
        price[i]=integerInput();
    }
    int sum=0;
    for(int j=0;j<num;j++)
    {
        sum+=price[j];
    }
    double rt=Math.cbrt(sum);
    int nn=(int) rt+1;
    if(rt==(nn-1))
        System.out.println("Yes,Eligible for gift hampper");
        else
        System.out.println("Rs " + ((nn*nn*nn)-sum) + " need to buy to get Gift hamper") ;
    }   
}
