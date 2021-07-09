public class Palindrome {
    public static void main(String[] args) {
        int pal, sum = 0, r;
        int n = 121;
        pal = n;       //pal=121
        while (n > 0) {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
        }
        if (pal == sum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}


/*
121>0                       12>0               1>0
121%10=1                    12%10=2            1%10=1
0*10+1=1                    1*10+2=12          12*10=120+1=121
n=123/10=12                 n=12/10=1          n=1/10=0
 */