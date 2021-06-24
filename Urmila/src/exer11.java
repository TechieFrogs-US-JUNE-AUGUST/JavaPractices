public class exer11 {// GCD of two numbers
    
    public static void main(String[] args){
        int num1= 60;
        int num2 = 12;
    while(num1 != num2){// != not equal to
        if(num1 > num2)
        num1 = num1 - num2;
        else
        num2 = num2 - num1;
    }
    System.out.printf("GCD of given numbers is: %d", num2);//decimal integer
    }
}