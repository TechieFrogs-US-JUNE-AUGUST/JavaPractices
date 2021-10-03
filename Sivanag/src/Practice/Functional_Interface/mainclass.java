package Practice.Functional_Interface;

public class mainclass {
    public static void main(String[] args) {
    Interfacefun fun = (n1)->{
        int temp=n1;
        int sum=0;
        
        while(temp>0)
        {
        int m = temp%10;
         sum=(sum*10)+m;
         temp=temp/10;
         }
        if(sum==n1)
        return 1;
        else
        return 0;

    };
    int n2=fun.palindrome(121);
    if(n2==1)
    System.out.println("Given number is a Palindrome");
    else
    System.out.println("Given number is not a Palindrome");
        
    }
    
}
