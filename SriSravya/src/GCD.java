public class GCD {
    public static void main(String[] args){
        int a=12,b=8;
        while(a!=b){
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }System.out.println("GCD is: "+b);
    }
}
