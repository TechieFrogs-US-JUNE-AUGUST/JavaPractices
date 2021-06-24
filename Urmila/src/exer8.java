public class exer8 {//factorial of a number
    
    public static void main(String[] args){
        int number = 5;
        long fact = 1;
       int a = 1;
        while(a<=number){
            fact = fact * a;
            a++;
        }
        System.out.println("Factorial of "+number+" is:" +fact );
    }
}