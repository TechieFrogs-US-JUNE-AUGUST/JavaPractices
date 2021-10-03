

import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter nth term");
        int num=sc.nextInt();
        if(num%2!=0)
        {
            System.out.println(num +" th value in the series is : " + (num+1));
        }
        else
        System.out.println(num +" th value in the series is : " + ((num-2)/2));

        sc.close();
    }
    
}
