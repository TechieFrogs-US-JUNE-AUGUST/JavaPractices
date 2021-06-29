import java.util.Scanner;
public class FactorialOfANumber {
    public static void main(String[] args) {
        int n, fact = 1;
        System.out.println("enter any number");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        /*for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial of"+" "+n+" "+"is:"+fact);
    }
}*/
        //Factorial using while loop
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println("factorial of" + " " + n + " " + "is:" + fact);
        s.close();
    }
}   

