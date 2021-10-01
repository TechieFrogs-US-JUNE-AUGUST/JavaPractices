package src.Assignment_Wipro;

public class Assignment11 {
    static int revNumber(int num)
    {
        int temp=0,rmd,r=1;
        while(num>0)
        {
            rmd=num%10;
            temp=(temp*r)+rmd;
            r=10;
            num/=10;
        }
        return temp;

    }
    public static void main(String[] args) {
        System.out.print("Enter Player Given Number : ");
        int num=Assignment2.integerInput();
        System.out.println(revNumber(num));
        System.out.println("Player Score is : " +(num-revNumber(num)));
        
    }
    
}
