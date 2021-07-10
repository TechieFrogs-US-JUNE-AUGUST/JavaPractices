import java.util.Scanner;
public class LargestAmongThree {
    public static void main(String[] args){
        int n1,n2,n3;
        System.out.println("enter n1,n2 and n3 values");
        Scanner s=new Scanner(System.in);
        n1=s.nextInt();
        n2=s.nextInt();
        n3=s.nextInt();
        if(n1>n2&&n1>n3){
            System.out.println("n1 is greater than n2 and n3");}
        else if(n2>n1&&n2>n3){
            System.out.println("n2 is greater than n1 and n3");}
        else if(n3>n1&&n3>n2){
            System.out.println("n3 is greater then n1 and n2");}
        else{
            System.out.println("please enter the valid input");
            s.close();
        }
     }
 } 

