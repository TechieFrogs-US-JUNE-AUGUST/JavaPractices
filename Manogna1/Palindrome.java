public class Palindrome {
    public static void main(String[] args)
     {
        int num=5335,reversednum=0,remainder;
        int temp=num;
        while(num!=0)
        {
            remainder=num%10;
            reversednum=reversednum*10+remainder;
            num=num/10;
        }
        if(temp==reversednum)
         {
            System.out.println(temp+ " is Palindrome");
         }
         else
         {
             System.out.println(temp+ " is not Palindrome");
         }
    }     
    
}
