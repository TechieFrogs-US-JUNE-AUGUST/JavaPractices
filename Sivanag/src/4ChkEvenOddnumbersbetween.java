class ChkEvenOddnumberbetween
{
    public static void main(String args[])
    {
        int x=1;
        int y=100;
        System.out.println("Even Numbers Between " + x + " to " +y);
        for(;x<=y;x++)
            {
                if(x%2 == 0) 
                System.out.println(x);
            
            }
            x=1;
            System.out.println("Odd Numbers Between " + x + " to " +y);
            for(;x<=y;x++)
            {
                if(x%2 != 0)
                System.out.println(x);
                
            }
    }
}