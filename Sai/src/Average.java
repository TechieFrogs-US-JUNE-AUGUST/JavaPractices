import java.util.Scanner;
class Average{
    int a,b,c;
    static double calculate(int a ,int b,int c){     //method with datatype int variables
        double ave = 0;          // for average we will get .00 , so we need to give double
        ave=(a+b+c)/3;           // calculating average
        //System.out.println("Average of 3 numbers : " + ave);
        return(ave);     // returning the value//
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);    //creating the scanner
       System.out.println("Enter a value : ");   // give input value
       int a = sc.nextInt();                 // expecting the int value
       System.out.println("Enter b value : ");
       int b = sc.nextInt();
       System.out.println("Enter c value : ");
       int c = sc.nextInt();
       Average.calculate(a,b,c);   //calling the method for calculating an average
       //calculate(a,b,c); we dont need to do seperate statment. we can do in print statement too.
       System.out.println("Average of three numbers :"+ calculate(a,b,c)); //method returs the average value
       sc.close();

    }
}