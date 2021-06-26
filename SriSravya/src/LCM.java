public class LCM {
    public static void main(String[] args){

        int a=12, b=8, lcm;

        lcm=(a>b) ? a : b;

        while(true)
            if(lcm%a==0 && lcm%b==0){
                System.out.printf("The LCM of %d and %d is %d.",a,b,lcm);
                break;
            }
        ++lcm;
    }
}
