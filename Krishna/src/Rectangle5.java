class Rectangle5
{
    int l,b,Area;
    Rectangle5(int l, int b)
    {
      Area=l*b;
      System.out.println("length is "+l);
      System.out.println("breadth is "+b);
      System.out.println("Area in SQ units "+Area);
    }
    public static void main(String[] args)
     {
        Rectangle5 obj=new Rectangle5(4,5);
        Rectangle5 obj1=new Rectangle5(5, 8);
    }
}