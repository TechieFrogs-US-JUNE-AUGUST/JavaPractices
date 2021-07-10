class swap2numbers
{
    public static void main(String args[])
    {
        int x=17;
        int y=27;
       // System.out.println("Given Numbers x =" +x + ",y =" + y);
       // x =x+y;
       // y=x-y;
       // x = x-y;
       // System.out.println("Given Numbers x =" +x + ",y =" + y);
        System.out.println("Given Numbers x =" +x + ",y =" + y);
        x = x*y;
        y = x/y;
        x = x/y;
        System.out.println("Swap Numbers x =" +x + ",y =" + y);
    }
}