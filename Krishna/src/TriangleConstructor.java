import java.lang.Math;
  class TriangleConstructor
{
     TriangleConstructor(int a, int b, int c) 
     {
      double A;
      int p,s;
      p=a+b+c;
      System.out.println("perimeter is " +p);
      s=p/2;
      A= Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.println("area is " +A);
     }      
       public static void main (String[] args)
      {
        TriangleConstructor Obj = new TriangleConstructor(3,4,5);
       /* double A;
        int p,s;
        p=a+b+c;
        System.out.println("perimeter is " +p);
        s=p/2;
        A= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("area is " +A);
*/
      }
    }