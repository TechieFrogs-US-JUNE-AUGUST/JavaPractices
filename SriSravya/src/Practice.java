
public class Practice {
    public static void main(String[] args){
        int x=20;
        int y=5;
        int z=4;
       // System.out.println(x++);
        //System.out.println(++x);

       // System.out.println(++x + ++x);
       // System.out.println(++x + x);
       //System.out.println(x + x++);
      // System.out.println(x++ + ++x);

      //System.out.println(21<<5);

      //System.out.println(10>>3);
      
       //System.out.println(x + ++x); 
      // System.out.println(~x);
        //System.out.println(~y);

       // System.out.println(!x);

        //System.out.println(x/y);

       // System.out.println(x<y && x<z);
        //System.out.println(x<y & x>z);
        //System.out.println(x>y || x<z);
        //System.out.println(x<y | x>z);

    /* int min=(x>y)?x:y;
       System.out.println(min);
       System.out.println(x>=y);
       AccessModifiers obj=new AccessModifiers();
       obj.practice();      */

       String s1="sri";
       String s2="sravya";
       s1=s1+s2;
       s2= s1.substring(0, s1.length()-s2.length());
       s1= s1.substring(s2.length());
       System.out.println(s1 + "   " +s2);
    }
    
}

