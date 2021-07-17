public class SwappingTwonumbers 
{
    public static void main (String[] args)
    {
        int a = 4, b = 7;
        System.out.println("Print numbers before swapping" );
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int num = a;                    //assigning value of 'a' to num
        a = b;                          //assigning value of 'b' to 'a'
        b = num;                        //assigning value of num to 'b'
        System.out.println("Print numbers after swappng");
        System.out.println("a =" + a); 
        System.out.println("b =" + b);
    }

}