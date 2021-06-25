

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a,b and c");
           int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b & a>c){
            System.out.println(a+" is largest");
        }
        else if(b>a & b>c){
            System.out.println(b+" is largest");
        }
        else{
            System.out.println(c+" is largest");
        }
    }
}
/* int a=4;
int b=5;
int c=9;
int largest= (a>b)?
             (a>c ? a:b) :
             (b>C ? b:c) :
             System.out.println(largest+ " is largest")
 */
