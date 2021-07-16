import java.util.Scanner;



public class Amstrong {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        int num=0;
        do {
            System.out.println("enter positive number");
            while(!scannerObj.hasNextInt()){
            System.out.println("this is not a number. please enter number ");
            scannerObj.next();
        }
         num=scannerObj.nextInt();
    }
    while(num<=0);  // if number lessthan or equal to 0 enters the loop
        int rem=1;
        int temp=num;
        int sum=0;
        while(num!=0){ //if num not equals to 0 enters the loop
            rem=num%10;  // getting the reminder
            sum=sum+(rem*rem*rem); // adding remider cube to sum
            num=num/10;// getting the quotient and storing in num
        }
        if(sum==temp){  // if sum equals to temp enters if loop
            System.out.println(temp+" is an armstrong number");
        }
        else // if sum not equals to temp print else statement
        System.out.println(temp+" is not an armstrong number");
        scannerObj.close();
    }
}
